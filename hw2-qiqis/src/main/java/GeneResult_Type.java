
/* First created by JCasGen Sat Oct 04 21:28:16 EDT 2014 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

import edu.cmu.deiis.types.Annotation_Type;

/** the GeneResult for the first annotator
 * Updated by JCasGen Tue Oct 07 22:49:39 EDT 2014
 * @generated */
public class GeneResult_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (GeneResult_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = GeneResult_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new GeneResult(addr, GeneResult_Type.this);
  			   GeneResult_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new GeneResult(addr, GeneResult_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GeneResult.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("GeneResult");
 
  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "GeneResult");
    return ll_cas.ll_getStringValue(addr, casFeatCode_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "GeneResult");
    ll_cas.ll_setStringValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_startPoint;
  /** @generated */
  final int     casFeatCode_startPoint;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStartPoint(int addr) {
        if (featOkTst && casFeat_startPoint == null)
      jcas.throwFeatMissing("startPoint", "GeneResult");
    return ll_cas.ll_getIntValue(addr, casFeatCode_startPoint);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStartPoint(int addr, int v) {
        if (featOkTst && casFeat_startPoint == null)
      jcas.throwFeatMissing("startPoint", "GeneResult");
    ll_cas.ll_setIntValue(addr, casFeatCode_startPoint, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endPoint;
  /** @generated */
  final int     casFeatCode_endPoint;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEndPoint(int addr) {
        if (featOkTst && casFeat_endPoint == null)
      jcas.throwFeatMissing("endPoint", "GeneResult");
    return ll_cas.ll_getIntValue(addr, casFeatCode_endPoint);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEndPoint(int addr, int v) {
        if (featOkTst && casFeat_endPoint == null)
      jcas.throwFeatMissing("endPoint", "GeneResult");
    ll_cas.ll_setIntValue(addr, casFeatCode_endPoint, v);}
    
  
 
  /** @generated */
  final Feature casFeat_geneName;
  /** @generated */
  final int     casFeatCode_geneName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGeneName(int addr) {
        if (featOkTst && casFeat_geneName == null)
      jcas.throwFeatMissing("geneName", "GeneResult");
    return ll_cas.ll_getStringValue(addr, casFeatCode_geneName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeneName(int addr, String v) {
        if (featOkTst && casFeat_geneName == null)
      jcas.throwFeatMissing("geneName", "GeneResult");
    ll_cas.ll_setStringValue(addr, casFeatCode_geneName, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public GeneResult_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.String", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_startPoint = jcas.getRequiredFeatureDE(casType, "startPoint", "uima.cas.Integer", featOkTst);
    casFeatCode_startPoint  = (null == casFeat_startPoint) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_startPoint).getCode();

 
    casFeat_endPoint = jcas.getRequiredFeatureDE(casType, "endPoint", "uima.cas.Integer", featOkTst);
    casFeatCode_endPoint  = (null == casFeat_endPoint) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endPoint).getCode();

 
    casFeat_geneName = jcas.getRequiredFeatureDE(casType, "geneName", "uima.cas.String", featOkTst);
    casFeatCode_geneName  = (null == casFeat_geneName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_geneName).getCode();

  }
}



    