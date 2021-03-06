/**
 * generated by Xtext 2.13.0
 */
package beleg.s78154S78236;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prolog Dsl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link beleg.s78154S78236.PrologDsl#getProgram <em>Program</em>}</li>
 *   <li>{@link beleg.s78154S78236.PrologDsl#getExQuery <em>Ex Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see beleg.s78154S78236.S78154S78236Package#getPrologDsl()
 * @model
 * @generated
 */
public interface PrologDsl extends EObject
{
  /**
   * Returns the value of the '<em><b>Program</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Program</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Program</em>' containment reference.
   * @see #setProgram(Program)
   * @see beleg.s78154S78236.S78154S78236Package#getPrologDsl_Program()
   * @model containment="true"
   * @generated
   */
  Program getProgram();

  /**
   * Sets the value of the '{@link beleg.s78154S78236.PrologDsl#getProgram <em>Program</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Program</em>' containment reference.
   * @see #getProgram()
   * @generated
   */
  void setProgram(Program value);

  /**
   * Returns the value of the '<em><b>Ex Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex Query</em>' containment reference.
   * @see #setExQuery(Exquery)
   * @see beleg.s78154S78236.S78154S78236Package#getPrologDsl_ExQuery()
   * @model containment="true"
   * @generated
   */
  Exquery getExQuery();

  /**
   * Sets the value of the '{@link beleg.s78154S78236.PrologDsl#getExQuery <em>Ex Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex Query</em>' containment reference.
   * @see #getExQuery()
   * @generated
   */
  void setExQuery(Exquery value);

} // PrologDsl
