/**
 * generated by Xtext 2.18.0.M3
 */
package edu.ulibertadores.PyDslRep;

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
 *   <li>{@link edu.ulibertadores.PyDslRep.Model#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see edu.ulibertadores.PyDslRep.PyDslRepPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Environment</b></em>' containment reference list.
   * The list contents are of type {@link edu.ulibertadores.PyDslRep.Entity}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Environment</em>' containment reference list.
   * @see edu.ulibertadores.PyDslRep.PyDslRepPackage#getModel_Environment()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEnvironment();

} // Model