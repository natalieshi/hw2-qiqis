

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.springframework.scripting.support.StaticScriptSource;

import abner.Tagger;

public class GeneEntityTwo extends JCasAnnotator_ImplBase {
  
  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    //get sentence things from annotation
    FSIterator<Annotation> it = aJCas.getAnnotationIndex(sentence.type).iterator();
    //initiate tagger
    Tagger tagger= new Tagger(Tagger.BIOCREATIVE);
    
    while(it.hasNext())
    {
      sentence sTag = (sentence)it.next();   
      String text=sTag.getContent();
      String[][] result=tagger.getEntities(text);
      String resulttext,newresult,newtext;
      int startpoint,endpoint;
      
      for(int i=0;i<result[0].length;i++)
      {
        resulttext=result[0][i];
        newresult=resulttext.replaceAll("\\s", "");
        newtext=text.replaceAll("\\s", "");
        
        startpoint=newtext.indexOf(newresult);
        //whitespace-excluded offsets are calculated only until cas consumer
        endpoint=-1+startpoint+newresult.length();

        GeneResult geneannotation= new GeneResult(aJCas);
        geneannotation.setStartPoint(startpoint);
        geneannotation.setEndPoint(endpoint);
        geneannotation.setId(sTag.getId());
        geneannotation.setGeneName(resulttext);
        geneannotation.setCasProcessorId("2");
        //System.out.println(sTag.getText().substring(chunkit.start(),chunkit.end()));
        //System.out.println(geneannotation.getId());
        geneannotation.addToIndexes();
       
      }

      
    }
    
    }
 }


