/**
 * generated by Xtext 2.13.0
 */
package beleg.s78154S78236;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link beleg.s78154S78236.Folge#getAtom <em>Atom</em>}</li>
 *   <li>{@link beleg.s78154S78236.Folge#getEatoms <em>Eatoms</em>}</li>
 * </ul>
 * </p>
 *
 * @see beleg.s78154S78236.S78154S78236Package#getFolge()
 * @model
 * @generated
 */
public interface Folge extends EObject
{
  /**
   * Returns the value of the '<em><b>Atom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atom</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atom</em>' containment reference.
   * @see #setAtom(Atom)
   * @see beleg.s78154S78236.S78154S78236Package#getFolge_Atom()
   * @model containment="true"
   * @generated
   */
  Atom getAtom();

  /**
   * Sets the value of the '{@link beleg.s78154S78236.Folge#getAtom <em>Atom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atom</em>' containment reference.
   * @see #getAtom()
   * @generated
   */
  void setAtom(Atom value);

  /**
   * Returns the value of the '<em><b>Eatoms</b></em>' containment reference list.
   * The list contents are of type {@link beleg.s78154S78236.EAtom}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eatoms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eatoms</em>' containment reference list.
   * @see beleg.s78154S78236.S78154S78236Package#getFolge_Eatoms()
   * @model containment="true"
   * @generated
   */
  EList<EAtom> getEatoms();

} // Folge