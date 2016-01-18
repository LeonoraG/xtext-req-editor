/**
 */
package eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RqsDslPackage
 * @generated
 */
public interface RqsDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RqsDslFactory eINSTANCE = eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RqsDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Requirement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requirement</em>'.
   * @generated
   */
  Requirement createRequirement();

  /**
   * Returns a new object of class '<em>TAnnotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TAnnotation</em>'.
   * @generated
   */
  TAnnotation createTAnnotation();

  /**
   * Returns a new object of class '<em>RAnnotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RAnnotation</em>'.
   * @generated
   */
  RAnnotation createRAnnotation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RqsDslPackage getRqsDslPackage();

} //RqsDslFactory
