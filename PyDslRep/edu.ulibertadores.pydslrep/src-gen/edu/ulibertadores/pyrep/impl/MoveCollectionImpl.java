/**
 * generated by Xtext 2.18.0.M3
 */
package edu.ulibertadores.PyDslRep.impl;

import edu.ulibertadores.PyDslRep.AbstractDataMove;
import edu.ulibertadores.PyDslRep.MoveCollection;
import edu.ulibertadores.PyDslRep.PyDslRepPackage;
import edu.ulibertadores.PyDslRep.Robot;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ulibertadores.PyDslRep.impl.MoveCollectionImpl#isConcurrent <em>Concurrent</em>}</li>
 *   <li>{@link edu.ulibertadores.PyDslRep.impl.MoveCollectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.ulibertadores.PyDslRep.impl.MoveCollectionImpl#getRobot <em>Robot</em>}</li>
 *   <li>{@link edu.ulibertadores.PyDslRep.impl.MoveCollectionImpl#getMoves <em>Moves</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveCollectionImpl extends EntityImpl implements MoveCollection
{
  /**
   * The default value of the '{@link #isConcurrent() <em>Concurrent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConcurrent()
   * @generated
   * @ordered
   */
  protected static final boolean CONCURRENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConcurrent() <em>Concurrent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConcurrent()
   * @generated
   * @ordered
   */
  protected boolean concurrent = CONCURRENT_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRobot() <em>Robot</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRobot()
   * @generated
   * @ordered
   */
  protected Robot robot;

  /**
   * The cached value of the '{@link #getMoves() <em>Moves</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMoves()
   * @generated
   * @ordered
   */
  protected EList<AbstractDataMove> moves;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MoveCollectionImpl()
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
    return PyDslRepPackage.Literals.MOVE_COLLECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isConcurrent()
  {
    return concurrent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConcurrent(boolean newConcurrent)
  {
    boolean oldConcurrent = concurrent;
    concurrent = newConcurrent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PyDslRepPackage.MOVE_COLLECTION__CONCURRENT, oldConcurrent, concurrent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PyDslRepPackage.MOVE_COLLECTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Robot getRobot()
  {
    if (robot != null && robot.eIsProxy())
    {
      InternalEObject oldRobot = (InternalEObject)robot;
      robot = (Robot)eResolveProxy(oldRobot);
      if (robot != oldRobot)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PyDslRepPackage.MOVE_COLLECTION__ROBOT, oldRobot, robot));
      }
    }
    return robot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Robot basicGetRobot()
  {
    return robot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRobot(Robot newRobot)
  {
    Robot oldRobot = robot;
    robot = newRobot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PyDslRepPackage.MOVE_COLLECTION__ROBOT, oldRobot, robot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AbstractDataMove> getMoves()
  {
    if (moves == null)
    {
      moves = new EObjectContainmentEList<AbstractDataMove>(AbstractDataMove.class, this, PyDslRepPackage.MOVE_COLLECTION__MOVES);
    }
    return moves;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PyDslRepPackage.MOVE_COLLECTION__MOVES:
        return ((InternalEList<?>)getMoves()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case PyDslRepPackage.MOVE_COLLECTION__CONCURRENT:
        return isConcurrent();
      case PyDslRepPackage.MOVE_COLLECTION__NAME:
        return getName();
      case PyDslRepPackage.MOVE_COLLECTION__ROBOT:
        if (resolve) return getRobot();
        return basicGetRobot();
      case PyDslRepPackage.MOVE_COLLECTION__MOVES:
        return getMoves();
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
      case PyDslRepPackage.MOVE_COLLECTION__CONCURRENT:
        setConcurrent((Boolean)newValue);
        return;
      case PyDslRepPackage.MOVE_COLLECTION__NAME:
        setName((String)newValue);
        return;
      case PyDslRepPackage.MOVE_COLLECTION__ROBOT:
        setRobot((Robot)newValue);
        return;
      case PyDslRepPackage.MOVE_COLLECTION__MOVES:
        getMoves().clear();
        getMoves().addAll((Collection<? extends AbstractDataMove>)newValue);
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
      case PyDslRepPackage.MOVE_COLLECTION__CONCURRENT:
        setConcurrent(CONCURRENT_EDEFAULT);
        return;
      case PyDslRepPackage.MOVE_COLLECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PyDslRepPackage.MOVE_COLLECTION__ROBOT:
        setRobot((Robot)null);
        return;
      case PyDslRepPackage.MOVE_COLLECTION__MOVES:
        getMoves().clear();
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
      case PyDslRepPackage.MOVE_COLLECTION__CONCURRENT:
        return concurrent != CONCURRENT_EDEFAULT;
      case PyDslRepPackage.MOVE_COLLECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PyDslRepPackage.MOVE_COLLECTION__ROBOT:
        return robot != null;
      case PyDslRepPackage.MOVE_COLLECTION__MOVES:
        return moves != null && !moves.isEmpty();
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
    result.append(" (concurrent: ");
    result.append(concurrent);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MoveCollectionImpl