import java.util.HashMap;
import java.util.Iterator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import edu.cmu.deiis.types.GeneResult;
import edu.cmu.deiis.types.finalResult;


public class AggregateGeneEntity extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    FSIterator<Annotation> it = aJCas.getAnnotationIndex(GeneResult.type).iterator();
    
    HashMap<String, Integer> resultmap=new HashMap<String, Integer>();
    String info=null;
    while(it.hasNext())
    {
      GeneResult gr=(GeneResult) it.next();
      info=gr.getId()+"|"+gr.getStartPoint()+" "+gr.getEndPoint()+"|"+gr.getGeneName();
      if(resultmap.containsKey(info))
      {
       resultmap.put(info, resultmap.get(info)+1);
      }
      else {
       resultmap.put(info, 1);
      }
    }
    
   for(String key:resultmap.keySet())
   {
     
     if(resultmap.get(key)>=2)
     {
       finalResult r= new finalResult(aJCas);
       r.setFinalResult(key);
       r.addToIndexes();
     }
     else {
      continue;
    }
   }
   
  }

   
}
