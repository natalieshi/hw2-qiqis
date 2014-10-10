
/* First created by JCasGen Thu Oct 09 12:48:39 EDT 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** the finalResult of the system
 * Updated by JCasGen Fri Oct 10 12:32:52 EDT 2014
 * @generated */
public class finalResult_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (finalResult_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = finalResult_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new finalResult(addr, finalResult_Type.this);
  			   finalResult_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new finalResult(addr, finalResult_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = finalResult.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.finalResult");
 
  /** @generated */
  final Feature casFeat_finalResult;
  /** @generated */
  final int     casFeatCode_finalResult;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFinalResult(int addr) {
        if (featOkTst && casFeat_finalResult == null)
      jcas.throwFeatMissing("finalResult", "edu.cmu.deiis.types.finalResult");
    return ll_cas.ll_getStringValue(addr, casFeatCode_finalResult);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFinalResult(int addr, String v) {
        if (featOkTst && casFeat_finalResult == null)
      jcas.throwFeatMissing("finalResult", "edu.cmu.deiis.types.finalResult");
    ll_cas.ll_setStringValue(addr, casFeatCode_finalResult, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public finalResult_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_finalResult = jcas.getRequiredFeatureDE(casType, "finalResult", "uima.cas.String", featOkTst);
    casFeatCode_finalResult  = (null == casFeat_finalResult) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_finalResult).getCode();

  }
}



    