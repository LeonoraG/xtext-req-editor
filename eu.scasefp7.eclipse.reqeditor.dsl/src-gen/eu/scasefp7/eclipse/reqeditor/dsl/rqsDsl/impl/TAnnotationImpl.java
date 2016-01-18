/**
 */
package eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl;

import eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RqsDslPackage;
import eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAnnotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.TAnnotationImpl#getNum <em>Num</em>}</li>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.TAnnotationImpl#getId <em>Id</em>}</li>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.TAnnotationImpl#getType <em>Type</em>}</li>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.TAnnotationImpl#getA <em>A</em>}</li>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.TAnnotationImpl#getB <em>B</em>}</li>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.TAnnotationImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TAnnotationImpl extends MinimalEObjectImpl.Container implements TAnnotation
{
  /**
   * The default value of the '{@link #getNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected static final int NUM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected int num = NUM_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final int ID_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected int id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getA() <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected static final int A_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getA() <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected int a = A_EDEFAULT;

  /**
   * The default value of the '{@link #getB() <em>B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected static final int B_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected int b = B_EDEFAULT;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected EList<String> text;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TAnnotationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RqsDslPackage.Literals.TANNOTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNum()
  {
    return num;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNum(int newNum)
  {
    int oldNum = num;
    num = newNum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RqsDslPackage.TANNOTATION__NUM, oldNum, num));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(int newId)
  {
    int oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RqsDslPackage.TANNOTATION__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RqsDslPackage.TANNOTATION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getA()
  {
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setA(int newA)
  {
    int oldA = a;
    a = newA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RqsDslPackage.TANNOTATION__A, oldA, a));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getB()
  {
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB(int newB)
  {
    int oldB = b;
    b = newB;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RqsDslPackage.TANNOTATION__B, oldB, b));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getText()
  {
    if (text == null)
    {
      text = new EDataTypeEList<String>(String.class, this, RqsDslPackage.TANNOTATION__TEXT);
    }
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RqsDslPackage.TANNOTATION__NUM:
        return getNum();
      case RqsDslPackage.TANNOTATION__ID:
        return getId();
      case RqsDslPackage.TANNOTATION__TYPE:
        return getType();
      case RqsDslPackage.TANNOTATION__A:
        return getA();
      case RqsDslPackage.TANNOTATION__B:
        return getB();
      case RqsDslPackage.TANNOTATION__TEXT:
        return getText();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RqsDslPackage.TANNOTATION__NUM:
        setNum((Integer)newValue);
        return;
      case RqsDslPackage.TANNOTATION__ID:
        setId((Integer)newValue);
        return;
      case RqsDslPackage.TANNOTATION__TYPE:
        setType((String)newValue);
        return;
      case RqsDslPackage.TANNOTATION__A:
        setA((Integer)newValue);
        return;
      case RqsDslPackage.TANNOTATION__B:
        setB((Integer)newValue);
        return;
      case RqsDslPackage.TANNOTATION__TEXT:
        getText().clear();
        getText().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RqsDslPackage.TANNOTATION__NUM:
        setNum(NUM_EDEFAULT);
        return;
      case RqsDslPackage.TANNOTATION__ID:
        setId(ID_EDEFAULT);
        return;
      case RqsDslPackage.TANNOTATION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RqsDslPackage.TANNOTATION__A:
        setA(A_EDEFAULT);
        return;
      case RqsDslPackage.TANNOTATION__B:
        setB(B_EDEFAULT);
        return;
      case RqsDslPackage.TANNOTATION__TEXT:
        getText().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RqsDslPackage.TANNOTATION__NUM:
        return num != NUM_EDEFAULT;
      case RqsDslPackage.TANNOTATION__ID:
        return id != ID_EDEFAULT;
      case RqsDslPackage.TANNOTATION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case RqsDslPackage.TANNOTATION__A:
        return a != A_EDEFAULT;
      case RqsDslPackage.TANNOTATION__B:
        return b != B_EDEFAULT;
      case RqsDslPackage.TANNOTATION__TEXT:
        return text != null && !text.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (num: ");
    result.append(num);
    result.append(", id: ");
    result.append(id);
    result.append(", type: ");
    result.append(type);
    result.append(", a: ");
    result.append(a);
    result.append(", b: ");
    result.append(b);
    result.append(", text: ");
    result.append(text);
    result.append(')');
    return result.toString();
  }

} //TAnnotationImpl
