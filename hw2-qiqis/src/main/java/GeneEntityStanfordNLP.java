import java.util.Map;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;

import edu.cmu.deiis.types.GeneResult;
import edu.cmu.deiis.types.sentence;

public class GeneEntityStanfordNLP extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    System.out.println("sss");
    PosTagNamedEntityRecognizer recognizer = null;
    try {
      recognizer = new PosTagNamedEntityRecognizer();
    } catch (ResourceInitializationException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    Map<Integer, Integer> result;
    String text;
    int startpoint,endpoint;
    FSIterator<Annotation> it = aJCas.getAnnotationIndex(sentence.type).iterator();
    while(it.hasNext())
    {
      sentence sTag = (sentence)it.next();  
      text=sTag.getContent();
      result=recognizer.getGeneSpans(text);
      for(int start:result.keySet())
      {
      int end=result.get(start);
      
    //assign results to the gene
      startpoint=text.substring(0, start).replaceAll("\\s", "").length();
      //whitespace-excluded offsets are calculated only until cas consumer
      endpoint=text.substring(0, end).replaceAll("\\s", "").length();
      
      GeneResult geneannotation= new GeneResult(aJCas);
      geneannotation.setStartPoint(startpoint);
      geneannotation.setEndPoint(endpoint);
      geneannotation.setId(sTag.getId());
      geneannotation.setGeneName(text.substring(start,end));
      //System.out.println(sTag.getId()+" "+startpoint+" "+endpoint+text.substring(start, end));
 
      geneannotation.setCasProcessorId("3");
      //System.out.println(sTag.getText().substring(chunkit.start(),chunkit.end()));
      //System.out.println(geneannotation.getId());
      geneannotation.addToIndexes();
    }

  }

  }
}
