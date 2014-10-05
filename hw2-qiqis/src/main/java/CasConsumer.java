import java.io.BufferedReader;
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
 * Output the final result and 
 * Evaluate the Result
 *
 */
public class CasConsumer extends CasConsumer_ImplBase {

  /**
   * Output the result
   * 
   * @param CAS It provides access to the type system, to indexes, iterators and filters (constraints)
   * @exception ResourceProcessException
   */

  public void processCas(CAS arg0) throws ResourceProcessException {
    // TODO Auto-generated method stub
    File f= new File("hw2-qiqis.out");
    
  //read info from sample.out
    String tmpt;
    int samplenumber = 0;
    HashSet<String> s=new HashSet<String>(); 
    BufferedReader br=null;
    try {
      br=new BufferedReader(new FileReader("src/main/resources/data/sample.out"));
      tmpt=br.readLine();
     while(tmpt!=null)
     {
       s.add(tmpt);
       samplenumber++;
       tmpt=br.readLine();
     }
    } catch (FileNotFoundException e2) {
      // TODO Auto-generated catch block
      e2.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    
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
    
    //the calculation of F-measure
    int rightnumber=0;//the right number of geneTag
    int totalrecognizenumber = 0;
    FSIterator<Annotation> it = jcas.getAnnotationIndex(GeneResult.type).iterator();
    while(it.hasNext())
    {
      GeneResult gt=(GeneResult) it.next();
      String info=gt.getId()+"|"+gt.getStartPoint()+" "+gt.getEndPoint()+"|"+gt.getGeneName();
      try {
        totalrecognizenumber++;
        bw.write(info);
        bw.newLine();
        if(s.contains(info))
          rightnumber++;
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
    
    //output evaluation info

    float precision=(float) (rightnumber*1.0/totalrecognizenumber*1.0);
    float recall=(float)(rightnumber*1.0/samplenumber*1.0);
    float F=(float) 2* precision*recall/(precision+recall);
    System.out.println("precision="+precision);
    System.out.println("recall="+recall);
    System.out.println("F-measure="+F);

    
  }

}
