/**
 */
package eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl;

import eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RqsDslFactoryImpl extends EFactoryImpl implements RqsDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RqsDslFactory init()
  {
    try
    {
      RqsDslFactory theRqsDslFactory = (RqsDslFactory)EPackage.Registry.INSTANCE.getEFactory(RqsDslPackage.eNS_URI);
      if (theRqsDslFactory != null)
      {
        return theRqsDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RqsDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RqsDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RqsDslPackage.MODEL: return createModel();
      case RqsDslPackage.REQUIREMENT: return createRequirement();
      case RqsDslPackage.TANNOTATION: return createTAnnotation();
      case RqsDslPackage.RANNOTATION: return createRAnnotation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement createRequirement()
  {
    RequirementImpl requirement = new RequirementImpl();
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TAnnotation createTAnnotation()
  {
    TAnnotationImpl tAnnotation = new TAnnotationImpl();
    return tAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RAnnotation createRAnnotation()
  {
    RAnnotationImpl rAnnotation = new RAnnotationImpl();
    return rAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RqsDslPackage getRqsDslPackage()
  {
    return (RqsDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RqsDslPackage getPackage()
  {
    return RqsDslPackage.eINSTANCE;
  }

} //RqsDslFactoryImpl
