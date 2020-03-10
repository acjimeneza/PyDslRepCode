/**
 * generated by Xtext 2.18.0.M3
 */
package edu.ulibertadores.PyDslRep.impl;

import edu.ulibertadores.PyDslRep.DataMove;
import edu.ulibertadores.PyDslRep.PyDslRepPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ulibertadores.PyDslRep.impl.DataMoveImpl#isName <em>Name</em>}</li>
 *   <li>{@link edu.ulibertadores.PyDslRep.impl.DataMoveImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.ulibertadores.PyDslRep.impl.DataMoveImpl#getVelocity <em>Velocity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataMoveImpl extends EntityImpl implements DataMove
{
  /**
   * The default value of the '{@link #isName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isName()
   * @generated
   * @ordered
   */
  protected static final boolean NAME_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isName()
   * @generated
   * @ordered
   */
  protected boolean name = NAME_EDEFAULT;

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
   * The default value of the '{@link #getVelocity() <em>Velocity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVelocity()
   * @generated
   * @ordered
   */
  protected static final String VELOCITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVelocity() <em>Velocity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVelocity()
   * @generated
   * @ordered
   */
  protected String velocity = VELOCITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataMoveImpl()
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
    return PyDslRepPackage.Literals.DATA_MOVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(boolean newName)
  {
    boolean oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PyDslRepPackage.DATA_MOVE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PyDslRepPackage.DATA_MOVE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVelocity()
  {
    return velocity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVelocity(String newVelocity)
  {
    String oldVelocity = velocity;
    velocity = newVelocity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PyDslRepPackage.DATA_MOVE__VELOCITY, oldVelocity, velocity));
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
      case PyDslRepPackage.DATA_MOVE__NAME:
        return isName();
      case PyDslRepPackage.DATA_MOVE__TYPE:
        return getType();
      case PyDslRepPackage.DATA_MOVE__VELOCITY:
        return getVelocity();
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
      case PyDslRepPackage.DATA_MOVE__NAME:
        setName((Boolean)newValue);
        return;
      case PyDslRepPackage.DATA_MOVE__TYPE:
        setType((String)newValue);
        return;
      case PyDslRepPackage.DATA_MOVE__VELOCITY:
        setVelocity((String)newValue);
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
      case PyDslRepPackage.DATA_MOVE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PyDslRepPackage.DATA_MOVE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case PyDslRepPackage.DATA_MOVE__VELOCITY:
        setVelocity(VELOCITY_EDEFAULT);
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
      case PyDslRepPackage.DATA_MOVE__NAME:
        return name != NAME_EDEFAULT;
      case PyDslRepPackage.DATA_MOVE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case PyDslRepPackage.DATA_MOVE__VELOCITY:
        return VELOCITY_EDEFAULT == null ? velocity != null : !VELOCITY_EDEFAULT.equals(velocity);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(", velocity: ");
    result.append(velocity);
    result.append(')');
    return result.toString();
  }

} //DataMoveImpl
