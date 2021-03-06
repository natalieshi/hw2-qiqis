

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.springframework.scripting.support.StaticScriptSource;

import edu.cmu.deiis.types.GeneResult;
import edu.cmu.deiis.types.sentence;
import abner.Tagger;

/**
 *  Get the text of a sentence from sentence
 * Find the GeneEntity by using Abner
 * Store the result in GeneResult
 * @author shiqiqi
 * @generated
 */
public class GeneEntityAbner extends JCasAnnotator_ImplBase {
  
  @Override
 
  /**
   * Cope the data with Abner method.
   * This is an override method
   * @param CAS It provides access to the type system, to indexes, iterators and filters (constraints).
   *         It also lets you create new annotations and other data structures
   * @throws AnalysisEngineProcessException
   */
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


