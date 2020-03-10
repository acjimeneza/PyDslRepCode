/**
 * generated by Xtext 2.18.0.M3
 */
package edu.ulibertadores.PyDslRep.impl;

import edu.ulibertadores.PyDslRep.Move;
import edu.ulibertadores.PyDslRep.PyDslRepPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ulibertadores.PyDslRep.impl.MoveImpl#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveImpl extends DataMoveImpl implements Move
{
  /**
   * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistance()
   * @generated
   * @ordered
   */
  protected static final String DISTANCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistance()
   * @generated
   * @ordered
   */
  protected String distance = DISTANCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MoveImpl()
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
    return PyDslRepPackage.Literals.MOVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDistance()
  {
    return distance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDistance(String newDistance)
  {
    String oldDistance = distance;
    distance = newDistance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PyDslRepPackage.MOVE__DISTANCE, oldDistance, distance));
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
      case PyDslRepPackage.MOVE__DISTANCE:
        return getDistance();
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
      case PyDslRepPackage.MOVE__DISTANCE:
        setDistance((String)newValue);
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
      case PyDslRepPackage.MOVE__DISTANCE:
        setDistance(DISTANCE_EDEFAULT);
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
      case PyDslRepPackage.MOVE__DISTANCE:
        return DISTANCE_EDEFAULT == null ? distance != null : !DISTANCE_EDEFAULT.equals(distance);
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
    result.append(" (distance: ");
    result.append(distance);
    result.append(')');
    return result.toString();
  }

} //MoveImpl
