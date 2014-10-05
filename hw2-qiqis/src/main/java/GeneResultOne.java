

/* First created by JCasGen Sat Oct 04 21:32:47 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.deiis.types.Annotation;


/** the GeneResult for the first annotator
 * Updated by JCasGen Sat Oct 04 21:32:47 EDT 2014
 * XML source: /Users/shiqiqi/git/hw2-qiqis/hw2-qiqis/src/main/resources/descriptors/geneEntityTwoDescriptor.xml
 * @generated */
public class GeneResultOne extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeneResultOne.class);
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
  protected GeneResultOne() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public GeneResultOne(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public GeneResultOne(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public GeneResultOne(JCas jcas, int begin, int end) {
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
    if (GeneResultOne_Type.featOkTst && ((GeneResultOne_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "GeneResultOne");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneResultOne_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets the id for the gene 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (GeneResultOne_Type.featOkTst && ((GeneResultOne_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "GeneResultOne");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneResultOne_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: startPoint

  /** getter for startPoint - gets the startPoint of gene
   * @generated
   * @return value of the feature 
   */
  public int getStartPoint() {
    if (GeneResultOne_Type.featOkTst && ((GeneResultOne_Type)jcasType).casFeat_startPoint == null)
      jcasType.jcas.throwFeatMissing("startPoint", "GeneResultOne");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GeneResultOne_Type)jcasType).casFeatCode_startPoint);}
    
  /** setter for startPoint - sets the startPoint of gene 
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartPoint(int v) {
    if (GeneResultOne_Type.featOkTst && ((GeneResultOne_Type)jcasType).casFeat_startPoint == null)
      jcasType.jcas.throwFeatMissing("startPoint", "GeneResultOne");
    jcasType.ll_cas.ll_setIntValue(addr, ((GeneResultOne_Type)jcasType).casFeatCode_startPoint, v);}    
   
    
  //*--------------*
  //* Feature: endPoint

  /** getter for endPoint - gets the end point of gene
   * @generated
   * @return value of the feature 
   */
  public int getEndPoint() {
    if (GeneResultOne_Type.featOkTst && ((GeneResultOne_Type)jcasType).casFeat_endPoint == null)
      jcasType.jcas.throwFeatMissing("endPoint", "GeneResultOne");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GeneResultOne_Type)jcasType).casFeatCode_endPoint);}
    
  /** setter for endPoint - sets the end point of gene 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndPoint(int v) {
    if (GeneResultOne_Type.featOkTst && ((GeneResultOne_Type)jcasType).casFeat_endPoint == null)
      jcasType.jcas.throwFeatMissing("endPoint", "GeneResultOne");
    jcasType.ll_cas.ll_setIntValue(addr, ((GeneResultOne_Type)jcasType).casFeatCode_endPoint, v);}    
   
    
  //*--------------*
  //* Feature: geneName

  /** getter for geneName - gets the name for the gene
   * @generated
   * @return value of the feature 
   */
  public String getGeneName() {
    if (GeneResultOne_Type.featOkTst && ((GeneResultOne_Type)jcasType).casFeat_geneName == null)
      jcasType.jcas.throwFeatMissing("geneName", "GeneResultOne");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneResultOne_Type)jcasType).casFeatCode_geneName);}
    
  /** setter for geneName - sets the name for the gene 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeneName(String v) {
    if (GeneResultOne_Type.featOkTst && ((GeneResultOne_Type)jcasType).casFeat_geneName == null)
      jcasType.jcas.throwFeatMissing("geneName", "GeneResultOne");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneResultOne_Type)jcasType).casFeatCode_geneName, v);}    
  }

    