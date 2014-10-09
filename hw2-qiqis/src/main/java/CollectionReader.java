import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.Progress;

import edu.cmu.deiis.types.sentence;
/**
 *Read sentence from text line by line and pass the data to sentenceTag
 * <p> CollectionReader extends from CollectionReader_ImplBase 
 * because it must implement the org.apache.uima.collection.CollectionReader interface
 * @author shiqiqi
 */

public class CollectionReader extends CollectionReader_ImplBase {

  BufferedReader reader = null;
  String tmp=null;
  public static String modelFile=null;
  

  /**
   * Open FileReader of parameter.This is an override method
   * @throws ResourceInitializationException
   */
  public void initialize() throws ResourceInitializationException{
    try {
      //proper use of configuration parameters instead of hard-wired model/file path
      String FilePath= (String) getConfigParameterValue("InputFile");
      modelFile= (String) getConfigParameterValue("modelFile");
      System.out.println("here");
      reader = new BufferedReader(new FileReader(FilePath));
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  /**
   * Read data from sources line by line 
   * new one sentenceTag for each line and pass it to CAS
   * This is an override method
   * @param CAS It provides access to the type system, to indexes, iterators and filters (constraints).
   *         It also lets you create new annotations and other data structures
   * @throws IOException, CollectionException
   */
  public void getNext(CAS aCAS) throws IOException, CollectionException {
    // TODO Auto-generated method stub
    System.out.println("here2");
    JCas jcas = null;
    try {
      jcas=aCAS.getJCas();
    } catch (CASException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    while(hasNext())    //line-by-line collection reader
    {
      //id and text are separated during reading collection
      sentence sentencesTag=new sentence(jcas);
      int index=tmp.indexOf(" ");      
      sentencesTag.setId(tmp.substring(0, index));
      sentencesTag.setContent(tmp.substring(index+1, tmp.length()));
      sentencesTag.addToIndexes();
      //id and text are separated during reading collection
    }
    System.out.println("finish");
}
  
  /**
   * Judge whether there are more line to be read. 
   * This is an override method
   * @return boolean Yes: more lines need to be read
   *                 No: no line more
   * @throws IOException, CollectionException
   */
  public boolean hasNext() throws IOException, CollectionException {
    // TODO Auto-generated method stub
    tmp=reader.readLine();//line-by-line collection reader
    if(tmp==null) return false;
    return true;
  }

  @Override
  public Progress[] getProgress() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void close() throws IOException {
    // TODO Auto-generated method stub

  }

}
