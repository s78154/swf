/**
 * generated by Xtext 2.13.0
 */
package beleg.s78154S78236;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link beleg.s78154S78236.Clause#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link beleg.s78154S78236.Clause#getFact <em>Fact</em>}</li>
 *   <li>{@link beleg.s78154S78236.Clause#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see beleg.s78154S78236.S78154S78236Package#getClause()
 * @model
 * @generated
 */
public interface Clause extends EObject
{
  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference.
   * @see #setPredicate(Predicate)
   * @see beleg.s78154S78236.S78154S78236Package#getClause_Predicate()
   * @model containment="true"
   * @generated
   */
  Predicate getPredicate();

  /**
   * Sets the value of the '{@link beleg.s78154S78236.Clause#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(Predicate value);

  /**
   * Returns the value of the '<em><b>Fact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fact</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fact</em>' attribute.
   * @see #setFact(String)
   * @see beleg.s78154S78236.S78154S78236Package#getClause_Fact()
   * @model
   * @generated
   */
  String getFact();

  /**
   * Sets the value of the '{@link beleg.s78154S78236.Clause#getFact <em>Fact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fact</em>' attribute.
   * @see #getFact()
   * @generated
   */
  void setFact(String value);

  /**
   * Returns the value of the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' containment reference.
   * @see #setRule(Rule)
   * @see beleg.s78154S78236.S78154S78236Package#getClause_Rule()
   * @model containment="true"
   * @generated
   */
  Rule getRule();

  /**
   * Sets the value of the '{@link beleg.s78154S78236.Clause#getRule <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' containment reference.
   * @see #getRule()
   * @generated
   */
  void setRule(Rule value);

} // Clause
