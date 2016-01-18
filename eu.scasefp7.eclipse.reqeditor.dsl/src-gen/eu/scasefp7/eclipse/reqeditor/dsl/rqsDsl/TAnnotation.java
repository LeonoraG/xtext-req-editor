/**
 */
package eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAnnotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getNum <em>Num</em>}</li>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getId <em>Id</em>}</li>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getType <em>Type</em>}</li>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getA <em>A</em>}</li>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getB <em>B</em>}</li>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RqsDslPackage#getTAnnotation()
 * @model
 * @generated
 */
public interface TAnnotation extends EObject
{
  /**
   * Returns the value of the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num</em>' attribute.
   * @see #setNum(int)
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RqsDslPackage#getTAnnotation_Num()
   * @model
   * @generated
   */
  int getNum();

  /**
   * Sets the value of the '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getNum <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num</em>' attribute.
   * @see #getNum()
   * @generated
   */
  void setNum(int value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(int)
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RqsDslPackage#getTAnnotation_Id()
   * @model
   * @generated
   */
  int getId();

  /**
   * Sets the value of the '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(int value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RqsDslPackage#getTAnnotation_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' attribute.
   * @see #setA(int)
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RqsDslPackage#getTAnnotation_A()
   * @model
   * @generated
   */
  int getA();

  /**
   * Sets the value of the '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getA <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' attribute.
   * @see #getA()
   * @generated
   */
  void setA(int value);

  /**
   * Returns the value of the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' attribute.
   * @see #setB(int)
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RqsDslPackage#getTAnnotation_B()
   * @model
   * @generated
   */
  int getB();

  /**
   * Sets the value of the '{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation#getB <em>B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' attribute.
   * @see #getB()
   * @generated
   */
  void setB(int value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute list.
   * @see eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RqsDslPackage#getTAnnotation_Text()
   * @model unique="false"
   * @generated
   */
  EList<String> getText();

} // TAnnotation
