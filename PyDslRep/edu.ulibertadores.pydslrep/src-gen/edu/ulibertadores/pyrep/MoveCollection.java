/**
 * generated by Xtext 2.18.0.M3
 */
package edu.ulibertadores.PyDslRep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ulibertadores.PyDslRep.MoveCollection#isConcurrent <em>Concurrent</em>}</li>
 *   <li>{@link edu.ulibertadores.PyDslRep.MoveCollection#getName <em>Name</em>}</li>
 *   <li>{@link edu.ulibertadores.PyDslRep.MoveCollection#getRobot <em>Robot</em>}</li>
 *   <li>{@link edu.ulibertadores.PyDslRep.MoveCollection#getMoves <em>Moves</em>}</li>
 * </ul>
 *
 * @see edu.ulibertadores.PyDslRep.PyDslRepPackage#getMoveCollection()
 * @model
 * @generated
 */
public interface MoveCollection extends Entity
{
  /**
   * Returns the value of the '<em><b>Concurrent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concurrent</em>' attribute.
   * @see #setConcurrent(boolean)
   * @see edu.ulibertadores.PyDslRep.PyDslRepPackage#getMoveCollection_Concurrent()
   * @model
   * @generated
   */
  boolean isConcurrent();

  /**
   * Sets the value of the '{@link edu.ulibertadores.PyDslRep.MoveCollection#isConcurrent <em>Concurrent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concurrent</em>' attribute.
   * @see #isConcurrent()
   * @generated
   */
  void setConcurrent(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see edu.ulibertadores.PyDslRep.PyDslRepPackage#getMoveCollection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.ulibertadores.PyDslRep.MoveCollection#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Robot</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Robot</em>' reference.
   * @see #setRobot(Robot)
   * @see edu.ulibertadores.PyDslRep.PyDslRepPackage#getMoveCollection_Robot()
   * @model
   * @generated
   */
  Robot getRobot();

  /**
   * Sets the value of the '{@link edu.ulibertadores.PyDslRep.MoveCollection#getRobot <em>Robot</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Robot</em>' reference.
   * @see #getRobot()
   * @generated
   */
  void setRobot(Robot value);

  /**
   * Returns the value of the '<em><b>Moves</b></em>' containment reference list.
   * The list contents are of type {@link edu.ulibertadores.PyDslRep.AbstractDataMove}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Moves</em>' containment reference list.
   * @see edu.ulibertadores.PyDslRep.PyDslRepPackage#getMoveCollection_Moves()
   * @model containment="true"
   * @generated
   */
  EList<AbstractDataMove> getMoves();

} // MoveCollection