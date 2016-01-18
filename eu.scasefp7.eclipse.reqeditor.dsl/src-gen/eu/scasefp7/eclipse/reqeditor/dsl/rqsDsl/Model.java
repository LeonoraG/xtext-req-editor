/**
 */
package eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.Model#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.Model#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RqsDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
   * The list contents are of type {@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.Requirement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requirements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirements</em>' containment reference list.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RqsDslPackage#getModel_Requirements()
   * @model containment="true"
   * @generated
   */
  EList<Requirement> getRequirements();

  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RqsDslPackage#getModel_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getAnnotations();

} // Model
