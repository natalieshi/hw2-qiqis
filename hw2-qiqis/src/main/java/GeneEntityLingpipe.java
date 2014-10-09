import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
import com.aliasi.chunk.ConfidenceChunker;
import com.aliasi.util.AbstractExternalizable;

import edu.cmu.deiis.types.GeneResult;
import edu.cmu.deiis.types.sentence;


public class GeneEntityLingpipe extends JCasAnnotator_ImplBase {

  public static final int MAX_N_BEST_CHUNKS=30000;
  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    int startpoint,endpoint;
    //System.out.println("here3");
    FSIterator<Annotation> it = aJCas.getAnnotationIndex(sentence.type).iterator();
    
    // load a trained model  
    ConfidenceChunker chunker = null;
    try {
      chunker = (ConfidenceChunker) AbstractExternalizable.readResourceObject(CollectionReader.modelFile);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
// cope with each sentence
    while(it.hasNext())
    {
      //get result from chunk    
     sentence sTag = (sentence)it.next();     
     try {     
      String text=sTag.getContent();
      char[] textarray= text.toCharArray();
      
      //get the chunk result
      Iterator<Chunk> chunkit
      = chunker.nBestChunks(textarray,0,textarray.length,MAX_N_BEST_CHUNKS);     
      
      while(chunkit.hasNext())
      {
        //get result form chunk
        Chunk cc = chunkit.next();
        double conf = Math.pow(2.0,cc.score());
        if(conf>0.6)
        {
        //assign results to the gene
        startpoint=text.substring(0, cc.start()).replaceAll("\\s", "").length();
        //whitespace-excluded offsets are calculated only until cas consumer
        endpoint=-1+text.substring(0, cc.end()).replaceAll("\\s", "").length();
        //System.out.println(start + " " + end);
       // System.out.println(startpoint+" "+endpoint);
        
        GeneResult geneannotation= new GeneResult(aJCas);
        geneannotation.setStartPoint(startpoint);
        geneannotation.setEndPoint(endpoint);
        geneannotation.setId(sTag.getId());
        geneannotation.setGeneName(text.substring(cc.start(),cc.end()));
        geneannotation.setConfidence(conf);
        geneannotation.setCasProcessorId("1");
        //System.out.println(sTag.getText().substring(chunkit.start(),chunkit.end()));
        //System.out.println(geneannotation.getId());
        geneannotation.addToIndexes();
        }
        else {
          continue;
        }
      }    
     }
     finally
     {
       
     }
      
     }
    }
  }


