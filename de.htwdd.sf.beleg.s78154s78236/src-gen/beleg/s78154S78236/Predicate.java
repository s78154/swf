/**
 * generated by Xtext 2.13.0
 */
package beleg.s78154S78236;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link beleg.s78154S78236.Predicate#getFunctor <em>Functor</em>}</li>
 *   <li>{@link beleg.s78154S78236.Predicate#getTerm <em>Term</em>}</li>
 *   <li>{@link beleg.s78154S78236.Predicate#getEterms <em>Eterms</em>}</li>
 * </ul>
 * </p>
 *
 * @see beleg.s78154S78236.S78154S78236Package#getPredicate()
 * @model
 * @generated
 */
public interface Predicate extends EObject
{
  /**
   * Returns the value of the '<em><b>Functor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functor</em>' containment reference.
   * @see #setFunctor(Functor)
   * @see beleg.s78154S78236.S78154S78236Package#getPredicate_Functor()
   * @model containment="true"
   * @generated
   */
  Functor getFunctor();

  /**
   * Sets the value of the '{@link beleg.s78154S78236.Predicate#getFunctor <em>Functor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functor</em>' containment reference.
   * @see #getFunctor()
   * @generated
   */
  void setFunctor(Functor value);

  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference.
   * @see #setTerm(Term)
   * @see beleg.s78154S78236.S78154S78236Package#getPredicate_Term()
   * @model containment="true"
   * @generated
   */
  Term getTerm();

  /**
   * Sets the value of the '{@link beleg.s78154S78236.Predicate#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(Term value);

  /**
   * Returns the value of the '<em><b>Eterms</b></em>' containment reference list.
   * The list contents are of type {@link beleg.s78154S78236.ETerm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eterms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eterms</em>' containment reference list.
   * @see beleg.s78154S78236.S78154S78236Package#getPredicate_Eterms()
   * @model containment="true"
   * @generated
   */
  EList<ETerm> getEterms();

} // Predicate
