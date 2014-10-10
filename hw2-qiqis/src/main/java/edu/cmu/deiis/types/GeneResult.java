

/* First created by JCasGen Thu Oct 09 12:48:39 EDT 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** the GeneResult for the first annotator
 * Updated by JCasGen Fri Oct 10 12:32:52 EDT 2014
 * XML source: /Users/shiqiqi/git/hw2-qiqis/hw2-qiqis/src/main/resources/descriptors/aggregateDescriptor.xml
 * @generated */
public class GeneResult extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeneResult.class);
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
  protected GeneResult() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public GeneResult(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public GeneResult(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public GeneResult(JCas jcas, int begin, int end) {
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

  /** getter for id - gets the id for the gene
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (GeneResult_Type.featOkTst && ((GeneResult_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "edu.cmu.deiis.types.GeneResult");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneResult_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets the id for the gene 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (GeneResult_Type.featOkTst && ((GeneResult_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "edu.cmu.deiis.types.GeneResult");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneResult_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: startPoint

  /** getter for startPoint - gets the startPoint of gene
   * @generated
   * @return value of the feature 
   */
  public int getStartPoint() {
    if (GeneResult_Type.featOkTst && ((GeneResult_Type)jcasType).casFeat_startPoint == null)
      jcasType.jcas.throwFeatMissing("startPoint", "edu.cmu.deiis.types.GeneResult");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GeneResult_Type)jcasType).casFeatCode_startPoint);}
    
  /** setter for startPoint - sets the startPoint of gene 
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartPoint(int v) {
    if (GeneResult_Type.featOkTst && ((GeneResult_Type)jcasType).casFeat_startPoint == null)
      jcasType.jcas.throwFeatMissing("startPoint", "edu.cmu.deiis.types.GeneResult");
    jcasType.ll_cas.ll_setIntValue(addr, ((GeneResult_Type)jcasType).casFeatCode_startPoint, v);}    
   
    
  //*--------------*
  //* Feature: endPoint

  /** getter for endPoint - gets the end point of gene
   * @generated
   * @return value of the feature 
   */
  public int getEndPoint() {
    if (GeneResult_Type.featOkTst && ((GeneResult_Type)jcasType).casFeat_endPoint == null)
      jcasType.jcas.throwFeatMissing("endPoint", "edu.cmu.deiis.types.GeneResult");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GeneResult_Type)jcasType).casFeatCode_endPoint);}
    
  /** setter for endPoint - sets the end point of gene 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndPoint(int v) {
    if (GeneResult_Type.featOkTst && ((GeneResult_Type)jcasType).casFeat_endPoint == null)
      jcasType.jcas.throwFeatMissing("endPoint", "edu.cmu.deiis.types.GeneResult");
    jcasType.ll_cas.ll_setIntValue(addr, ((GeneResult_Type)jcasType).casFeatCode_endPoint, v);}    
   
    
  //*--------------*
  //* Feature: geneName

  /** getter for geneName - gets the name for the gene
   * @generated
   * @return value of the feature 
   */
  public String getGeneName() {
    if (GeneResult_Type.featOkTst && ((GeneResult_Type)jcasType).casFeat_geneName == null)
      jcasType.jcas.throwFeatMissing("geneName", "edu.cmu.deiis.types.GeneResult");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneResult_Type)jcasType).casFeatCode_geneName);}
    
  /** setter for geneName - sets the name for the gene 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeneName(String v) {
    if (GeneResult_Type.featOkTst && ((GeneResult_Type)jcasType).casFeat_geneName == null)
      jcasType.jcas.throwFeatMissing("geneName", "edu.cmu.deiis.types.GeneResult");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneResult_Type)jcasType).casFeatCode_geneName, v);}    
  }

    