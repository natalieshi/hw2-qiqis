import java.io.BufferedReader;

import edu.cmu.deiis.types.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.text.AnnotationFS;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceProcessException;

/**
 * Output the final result
 *
 */
public class CasConsumer extends CasConsumer_ImplBase {
  /**
   * Output the final result
   * This is an override method
   * @param CAS It provides access to the type system, to indexes, iterators and filters (constraints).
   *         It also lets you create new annotations and other data structures
   * @throws ResourceProcessException
   */
  public void processCas(CAS arg0) throws ResourceProcessException {
    // TODO Auto-generated method stub
    
    File f= new File("hw2-qiqis.out");
    
      //write info to file
      BufferedWriter bw = null;
      try {
        bw = new BufferedWriter(new FileWriter(f));
      } catch (IOException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }
      
      JCas jcas = null;
      try {
        jcas = arg0.getJCas();
      } catch (CASException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }
      
      String info=null;
      FSIterator<Annotation> it = jcas.getAnnotationIndex(finalResult.type).iterator();

      while(it.hasNext())
      {
       finalResult gt=(finalResult) it.next();
       
        info=gt.getFinalResult();

          try {
            bw.write(info);
            bw.newLine();
          } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
      }
      
      try {
        bw.close();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

  }
 }

