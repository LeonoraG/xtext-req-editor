/**
 */
package eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl;

import eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.Model;
import eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation;
import eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.Requirement;
import eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RqsDslFactory;
import eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RqsDslPackage;
import eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RqsDslPackageImpl extends EPackageImpl implements RqsDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requirementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tAnnotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rAnnotationEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RqsDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RqsDslPackageImpl()
  {
    super(eNS_URI, RqsDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RqsDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RqsDslPackage init()
  {
    if (isInited) return (RqsDslPackage)EPackage.Registry.INSTANCE.getEPackage(RqsDslPackage.eNS_URI);

    // Obtain or create and register package
    RqsDslPackageImpl theRqsDslPackage = (RqsDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RqsDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RqsDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRqsDslPackage.createPackageContents();

    // Initialize created meta-data
    theRqsDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRqsDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RqsDslPackage.eNS_URI, theRqsDslPackage);
    return theRqsDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Requirements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Annotations()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequirement()
  {
    return requirementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_Text()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTAnnotation()
  {
    return tAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTAnnotation_Num()
  {
    return (EAttribute)tAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTAnnotation_Id()
  {
    return (EAttribute)tAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTAnnotation_Type()
  {
    return (EAttribute)tAnnotationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTAnnotation_A()
  {
    return (EAttribute)tAnnotationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTAnnotation_B()
  {
    return (EAttribute)tAnnotationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTAnnotation_Text()
  {
    return (EAttribute)tAnnotationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRAnnotation()
  {
    return rAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRAnnotation_Num()
  {
    return (EAttribute)rAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRAnnotation_Id()
  {
    return (EAttribute)rAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRAnnotation_Type()
  {
    return (EAttribute)rAnnotationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRAnnotation_Aa()
  {
    return (EAttribute)rAnnotationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRAnnotation_Ab()
  {
    return (EAttribute)rAnnotationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRAnnotation_Ba()
  {
    return (EAttribute)rAnnotationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRAnnotation_Bb()
  {
    return (EAttribute)rAnnotationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RqsDslFactory getRqsDslFactory()
  {
    return (RqsDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__REQUIREMENTS);
    createEReference(modelEClass, MODEL__ANNOTATIONS);

    requirementEClass = createEClass(REQUIREMENT);
    createEAttribute(requirementEClass, REQUIREMENT__TEXT);

    tAnnotationEClass = createEClass(TANNOTATION);
    createEAttribute(tAnnotationEClass, TANNOTATION__NUM);
    createEAttribute(tAnnotationEClass, TANNOTATION__ID);
    createEAttribute(tAnnotationEClass, TANNOTATION__TYPE);
    createEAttribute(tAnnotationEClass, TANNOTATION__A);
    createEAttribute(tAnnotationEClass, TANNOTATION__B);
    createEAttribute(tAnnotationEClass, TANNOTATION__TEXT);

    rAnnotationEClass = createEClass(RANNOTATION);
    createEAttribute(rAnnotationEClass, RANNOTATION__NUM);
    createEAttribute(rAnnotationEClass, RANNOTATION__ID);
    createEAttribute(rAnnotationEClass, RANNOTATION__TYPE);
    createEAttribute(rAnnotationEClass, RANNOTATION__AA);
    createEAttribute(rAnnotationEClass, RANNOTATION__AB);
    createEAttribute(rAnnotationEClass, RANNOTATION__BA);
    createEAttribute(rAnnotationEClass, RANNOTATION__BB);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Annotations(), ecorePackage.getEObject(), null, "annotations", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequirement_Text(), ecorePackage.getEString(), "text", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tAnnotationEClass, TAnnotation.class, "TAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTAnnotation_Num(), ecorePackage.getEInt(), "num", null, 0, 1, TAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTAnnotation_Id(), ecorePackage.getEInt(), "id", null, 0, 1, TAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTAnnotation_Type(), ecorePackage.getEString(), "type", null, 0, 1, TAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTAnnotation_A(), ecorePackage.getEInt(), "a", null, 0, 1, TAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTAnnotation_B(), ecorePackage.getEInt(), "b", null, 0, 1, TAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTAnnotation_Text(), ecorePackage.getEString(), "text", null, 0, -1, TAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rAnnotationEClass, RAnnotation.class, "RAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRAnnotation_Num(), ecorePackage.getEInt(), "num", null, 0, 1, RAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRAnnotation_Id(), ecorePackage.getEInt(), "id", null, 0, 1, RAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRAnnotation_Type(), ecorePackage.getEString(), "type", null, 0, 1, RAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRAnnotation_Aa(), ecorePackage.getEInt(), "aa", null, 0, 1, RAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRAnnotation_Ab(), ecorePackage.getEInt(), "ab", null, 0, 1, RAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRAnnotation_Ba(), ecorePackage.getEInt(), "ba", null, 0, 1, RAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRAnnotation_Bb(), ecorePackage.getEInt(), "bb", null, 0, 1, RAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //RqsDslPackageImpl
