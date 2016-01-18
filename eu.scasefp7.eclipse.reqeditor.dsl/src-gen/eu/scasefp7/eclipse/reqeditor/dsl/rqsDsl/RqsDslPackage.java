/**
 */
package eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RqsDslFactory
 * @model kind="package"
 * @generated
 */
public interface RqsDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rqsDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.scasefp7.eu/eclipse/reqeditor/dsl/RqsDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rqsDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RqsDslPackage eINSTANCE = eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RqsDslPackageImpl.init();

  /**
   * The meta object id for the '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.ModelImpl
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RqsDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__REQUIREMENTS = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ANNOTATIONS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RequirementImpl
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RqsDslPackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 1;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__TEXT = 0;

  /**
   * The number of structural features of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.TAnnotationImpl <em>TAnnotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.TAnnotationImpl
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RqsDslPackageImpl#getTAnnotation()
   * @generated
   */
  int TANNOTATION = 2;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TANNOTATION__NUM = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TANNOTATION__ID = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TANNOTATION__TYPE = 2;

  /**
   * The feature id for the '<em><b>A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TANNOTATION__A = 3;

  /**
   * The feature id for the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TANNOTATION__B = 4;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TANNOTATION__TEXT = 5;

  /**
   * The number of structural features of the '<em>TAnnotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TANNOTATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RAnnotationImpl <em>RAnnotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RAnnotationImpl
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RqsDslPackageImpl#getRAnnotation()
   * @generated
   */
  int RANNOTATION = 3;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANNOTATION__NUM = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANNOTATION__ID = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANNOTATION__TYPE = 2;

  /**
   * The feature id for the '<em><b>Aa</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANNOTATION__AA = 3;

  /**
   * The feature id for the '<em><b>Ab</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANNOTATION__AB = 4;

  /**
   * The feature id for the '<em><b>Ba</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANNOTATION__BA = 5;

  /**
   * The feature id for the '<em><b>Bb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANNOTATION__BB = 6;

  /**
   * The number of structural features of the '<em>RAnnotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANNOTATION_FEATURE_COUNT = 7;


  /**
   * Returns the meta object for class '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.Model#getRequirements <em>Requirements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requirements</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.Model#getRequirements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Requirements();

  /**
   * Returns the meta object for the containment reference list '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.Model#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.Model#getAnnotations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Annotations();

  /**
   * Returns the meta object for class '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.Requirement
   * @generated
   */
  EClass getRequirement();

  /**
   * Returns the meta object for the attribute '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.Requirement#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.Requirement#getText()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Text();

  /**
   * Returns the meta object for class '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation <em>TAnnotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TAnnotation</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation
   * @generated
   */
  EClass getTAnnotation();

  /**
   * Returns the meta object for the attribute '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getNum()
   * @see #getTAnnotation()
   * @generated
   */
  EAttribute getTAnnotation_Num();

  /**
   * Returns the meta object for the attribute '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getId()
   * @see #getTAnnotation()
   * @generated
   */
  EAttribute getTAnnotation_Id();

  /**
   * Returns the meta object for the attribute '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getType()
   * @see #getTAnnotation()
   * @generated
   */
  EAttribute getTAnnotation_Type();

  /**
   * Returns the meta object for the attribute '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>A</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getA()
   * @see #getTAnnotation()
   * @generated
   */
  EAttribute getTAnnotation_A();

  /**
   * Returns the meta object for the attribute '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>B</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getB()
   * @see #getTAnnotation()
   * @generated
   */
  EAttribute getTAnnotation_B();

  /**
   * Returns the meta object for the attribute list '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Text</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getText()
   * @see #getTAnnotation()
   * @generated
   */
  EAttribute getTAnnotation_Text();

  /**
   * Returns the meta object for class '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation <em>RAnnotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RAnnotation</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation
   * @generated
   */
  EClass getRAnnotation();

  /**
   * Returns the meta object for the attribute '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation#getNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation#getNum()
   * @see #getRAnnotation()
   * @generated
   */
  EAttribute getRAnnotation_Num();

  /**
   * Returns the meta object for the attribute '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation#getId()
   * @see #getRAnnotation()
   * @generated
   */
  EAttribute getRAnnotation_Id();

  /**
   * Returns the meta object for the attribute '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation#getType()
   * @see #getRAnnotation()
   * @generated
   */
  EAttribute getRAnnotation_Type();

  /**
   * Returns the meta object for the attribute '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation#getAa <em>Aa</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aa</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation#getAa()
   * @see #getRAnnotation()
   * @generated
   */
  EAttribute getRAnnotation_Aa();

  /**
   * Returns the meta object for the attribute '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation#getAb <em>Ab</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ab</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation#getAb()
   * @see #getRAnnotation()
   * @generated
   */
  EAttribute getRAnnotation_Ab();

  /**
   * Returns the meta object for the attribute '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation#getBa <em>Ba</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ba</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation#getBa()
   * @see #getRAnnotation()
   * @generated
   */
  EAttribute getRAnnotation_Ba();

  /**
   * Returns the meta object for the attribute '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation#getBb <em>Bb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bb</em>'.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation#getBb()
   * @see #getRAnnotation()
   * @generated
   */
  EAttribute getRAnnotation_Bb();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RqsDslFactory getRqsDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.ModelImpl
     * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RqsDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__REQUIREMENTS = eINSTANCE.getModel_Requirements();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ANNOTATIONS = eINSTANCE.getModel_Annotations();

    /**
     * The meta object literal for the '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RequirementImpl
     * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RqsDslPackageImpl#getRequirement()
     * @generated
     */
    EClass REQUIREMENT = eINSTANCE.getRequirement();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__TEXT = eINSTANCE.getRequirement_Text();

    /**
     * The meta object literal for the '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.TAnnotationImpl <em>TAnnotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.TAnnotationImpl
     * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RqsDslPackageImpl#getTAnnotation()
     * @generated
     */
    EClass TANNOTATION = eINSTANCE.getTAnnotation();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TANNOTATION__NUM = eINSTANCE.getTAnnotation_Num();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TANNOTATION__ID = eINSTANCE.getTAnnotation_Id();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TANNOTATION__TYPE = eINSTANCE.getTAnnotation_Type();

    /**
     * The meta object literal for the '<em><b>A</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TANNOTATION__A = eINSTANCE.getTAnnotation_A();

    /**
     * The meta object literal for the '<em><b>B</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TANNOTATION__B = eINSTANCE.getTAnnotation_B();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TANNOTATION__TEXT = eINSTANCE.getTAnnotation_Text();

    /**
     * The meta object literal for the '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RAnnotationImpl <em>RAnnotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RAnnotationImpl
     * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RqsDslPackageImpl#getRAnnotation()
     * @generated
     */
    EClass RANNOTATION = eINSTANCE.getRAnnotation();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANNOTATION__NUM = eINSTANCE.getRAnnotation_Num();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANNOTATION__ID = eINSTANCE.getRAnnotation_Id();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANNOTATION__TYPE = eINSTANCE.getRAnnotation_Type();

    /**
     * The meta object literal for the '<em><b>Aa</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANNOTATION__AA = eINSTANCE.getRAnnotation_Aa();

    /**
     * The meta object literal for the '<em><b>Ab</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANNOTATION__AB = eINSTANCE.getRAnnotation_Ab();

    /**
     * The meta object literal for the '<em><b>Ba</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANNOTATION__BA = eINSTANCE.getRAnnotation_Ba();

    /**
     * The meta object literal for the '<em><b>Bb</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANNOTATION__BB = eINSTANCE.getRAnnotation_Bb();

  }

} //RqsDslPackage
