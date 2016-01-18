/**
 */
package eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl;

import eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation;
import eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RqsDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RAnnotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RAnnotationImpl#getNum <em>Num</em>}</li>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RAnnotationImpl#getId <em>Id</em>}</li>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RAnnotationImpl#getType <em>Type</em>}</li>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RAnnotationImpl#getAa <em>Aa</em>}</li>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RAnnotationImpl#getAb <em>Ab</em>}</li>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RAnnotationImpl#getBa <em>Ba</em>}</li>
 *   <li>{@link eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.RAnnotationImpl#getBb <em>Bb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RAnnotationImpl extends MinimalEObjectImpl.Container implements RAnnotation
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
   * The default value of the '{@link #getAa() <em>Aa</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAa()
   * @generated
   * @ordered
   */
  protected static final int AA_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAa() <em>Aa</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAa()
   * @generated
   * @ordered
   */
  protected int aa = AA_EDEFAULT;

  /**
   * The default value of the '{@link #getAb() <em>Ab</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAb()
   * @generated
   * @ordered
   */
  protected static final int AB_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAb() <em>Ab</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAb()
   * @generated
   * @ordered
   */
  protected int ab = AB_EDEFAULT;

  /**
   * The default value of the '{@link #getBa() <em>Ba</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBa()
   * @generated
   * @ordered
   */
  protected static final int BA_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBa() <em>Ba</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBa()
   * @generated
   * @ordered
   */
  protected int ba = BA_EDEFAULT;

  /**
   * The default value of the '{@link #getBb() <em>Bb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBb()
   * @generated
   * @ordered
   */
  protected static final int BB_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBb() <em>Bb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBb()
   * @generated
   * @ordered
   */
  protected int bb = BB_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RAnnotationImpl()
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
    return RqsDslPackage.Literals.RANNOTATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RqsDslPackage.RANNOTATION__NUM, oldNum, num));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RqsDslPackage.RANNOTATION__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RqsDslPackage.RANNOTATION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAa()
  {
    return aa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAa(int newAa)
  {
    int oldAa = aa;
    aa = newAa;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RqsDslPackage.RANNOTATION__AA, oldAa, aa));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAb()
  {
    return ab;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAb(int newAb)
  {
    int oldAb = ab;
    ab = newAb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RqsDslPackage.RANNOTATION__AB, oldAb, ab));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBa()
  {
    return ba;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBa(int newBa)
  {
    int oldBa = ba;
    ba = newBa;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RqsDslPackage.RANNOTATION__BA, oldBa, ba));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBb()
  {
    return bb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBb(int newBb)
  {
    int oldBb = bb;
    bb = newBb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RqsDslPackage.RANNOTATION__BB, oldBb, bb));
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
      case RqsDslPackage.RANNOTATION__NUM:
        return getNum();
      case RqsDslPackage.RANNOTATION__ID:
        return getId();
      case RqsDslPackage.RANNOTATION__TYPE:
        return getType();
      case RqsDslPackage.RANNOTATION__AA:
        return getAa();
      case RqsDslPackage.RANNOTATION__AB:
        return getAb();
      case RqsDslPackage.RANNOTATION__BA:
        return getBa();
      case RqsDslPackage.RANNOTATION__BB:
        return getBb();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RqsDslPackage.RANNOTATION__NUM:
        setNum((Integer)newValue);
        return;
      case RqsDslPackage.RANNOTATION__ID:
        setId((Integer)newValue);
        return;
      case RqsDslPackage.RANNOTATION__TYPE:
        setType((String)newValue);
        return;
      case RqsDslPackage.RANNOTATION__AA:
        setAa((Integer)newValue);
        return;
      case RqsDslPackage.RANNOTATION__AB:
        setAb((Integer)newValue);
        return;
      case RqsDslPackage.RANNOTATION__BA:
        setBa((Integer)newValue);
        return;
      case RqsDslPackage.RANNOTATION__BB:
        setBb((Integer)newValue);
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
      case RqsDslPackage.RANNOTATION__NUM:
        setNum(NUM_EDEFAULT);
        return;
      case RqsDslPackage.RANNOTATION__ID:
        setId(ID_EDEFAULT);
        return;
      case RqsDslPackage.RANNOTATION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RqsDslPackage.RANNOTATION__AA:
        setAa(AA_EDEFAULT);
        return;
      case RqsDslPackage.RANNOTATION__AB:
        setAb(AB_EDEFAULT);
        return;
      case RqsDslPackage.RANNOTATION__BA:
        setBa(BA_EDEFAULT);
        return;
      case RqsDslPackage.RANNOTATION__BB:
        setBb(BB_EDEFAULT);
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
      case RqsDslPackage.RANNOTATION__NUM:
        return num != NUM_EDEFAULT;
      case RqsDslPackage.RANNOTATION__ID:
        return id != ID_EDEFAULT;
      case RqsDslPackage.RANNOTATION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case RqsDslPackage.RANNOTATION__AA:
        return aa != AA_EDEFAULT;
      case RqsDslPackage.RANNOTATION__AB:
        return ab != AB_EDEFAULT;
      case RqsDslPackage.RANNOTATION__BA:
        return ba != BA_EDEFAULT;
      case RqsDslPackage.RANNOTATION__BB:
        return bb != BB_EDEFAULT;
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
    result.append(", aa: ");
    result.append(aa);
    result.append(", ab: ");
    result.append(ab);
    result.append(", ba: ");
    result.append(ba);
    result.append(", bb: ");
    result.append(bb);
    result.append(')');
    return result.toString();
  }

} //RAnnotationImpl
