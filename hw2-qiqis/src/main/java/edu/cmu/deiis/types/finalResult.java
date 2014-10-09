

/* First created by JCasGen Thu Oct 09 12:48:39 EDT 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** the finalResult of the system
 * Updated by JCasGen Thu Oct 09 12:49:04 EDT 2014
 * XML source: /Users/shiqiqi/git/hw2-qiqis/hw2-qiqis/src/main/resources/descriptors/geneEntity_types.xml
 * @generated */
public class finalResult extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(finalResult.class);
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
  protected finalResult() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public finalResult(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public finalResult(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public finalResult(JCas jcas, int begin, int end) {
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
  //* Feature: finalResult

  /** getter for finalResult - gets the finalResult info
   * @generated
   * @return value of the feature 
   */
  public String getFinalResult() {
    if (finalResult_Type.featOkTst && ((finalResult_Type)jcasType).casFeat_finalResult == null)
      jcasType.jcas.throwFeatMissing("finalResult", "edu.cmu.deiis.types.finalResult");
    return jcasType.ll_cas.ll_getStringValue(addr, ((finalResult_Type)jcasType).casFeatCode_finalResult);}
    
  /** setter for finalResult - sets the finalResult info 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFinalResult(String v) {
    if (finalResult_Type.featOkTst && ((finalResult_Type)jcasType).casFeat_finalResult == null)
      jcasType.jcas.throwFeatMissing("finalResult", "edu.cmu.deiis.types.finalResult");
    jcasType.ll_cas.ll_setStringValue(addr, ((finalResult_Type)jcasType).casFeatCode_finalResult, v);}    
  }

    