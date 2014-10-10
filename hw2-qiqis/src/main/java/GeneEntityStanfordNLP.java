import java.io.IOException;
import java.util.Map;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;

import edu.cmu.deiis.types.GeneResult;
import edu.cmu.deiis.types.sentence;



/**
 * Get the text of a sentence from sentence
 * Find the GeneEntity by using Stanford
 * Store the result in GeneResult
 * @generated
 * @author shiqiqi
 *
 */
public class GeneEntityStanfordNLP extends JCasAnnotator_ImplBase {


  /**
   * Cope the data with StanfordNLP method.
   * This is an override method
   * @param CAS It provides access to the type system, to indexes, iterators and filters (constraints).
   *         It also lets you create new annotations and other data structures
   * @throws AnalysisEngineProcessException
   */
  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    
    // call PosTagNamedEntityRecognizer
    PosTagNamedEntityRecognizer recognizer = null;
    try {
      recognizer = new PosTagNamedEntityRecognizer();
    } catch (ResourceInitializationException e) {
           e.printStackTrace();
    }
    //input sentence info
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
      endpoint=-1+text.substring(0, end).replaceAll("\\s", "").length();
      
      GeneResult geneannotation= new GeneResult(aJCas);
      geneannotation.setStartPoint(startpoint);
      geneannotation.setEndPoint(endpoint);
      geneannotation.setId(sTag.getId());
      geneannotation.setGeneName(text.substring(start,end));
      geneannotation.setCasProcessorId("3");
      geneannotation.addToIndexes();
    }

  }

  }
}
