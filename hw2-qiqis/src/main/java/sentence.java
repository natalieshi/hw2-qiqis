

/* First created by JCasGen Sat Oct 04 16:52:15 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.tcas.Annotation;


/** the sentence data from the raw data
 * Updated by JCasGen Tue Oct 07 19:49:19 EDT 2014
 * XML source: /Users/shiqiqi/git/hw2-qiqis/hw2-qiqis/src/main/resources/descriptors/aggregateDescriptor.xml
 * @generated */
public class sentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(sentence.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public sentence(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets the string for the sentence
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (sentence_Type.featOkTst && ((sentence_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((sentence_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets the string for the sentence 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (sentence_Type.featOkTst && ((sentence_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((sentence_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: content

  /** getter for content - gets the content of the sentence
   * @generated
   * @return value of the feature 
   */
  public String getContent() {
    if (sentence_Type.featOkTst && ((sentence_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((sentence_Type)jcasType).casFeatCode_content);}
    
  /** setter for content - sets the content of the sentence 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContent(String v) {
    if (sentence_Type.featOkTst && ((sentence_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((sentence_Type)jcasType).casFeatCode_content, v);}    
  }

    