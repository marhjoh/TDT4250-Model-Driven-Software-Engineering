/**
 */
package fta_domain_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bracket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.Bracket#getRounds <em>Rounds</em>}</li>
 *   <li>{@link fta_domain_model.Bracket#getBracketSide <em>Bracket Side</em>}</li>
 *   <li>{@link fta_domain_model.Bracket#getMatches <em>Matches</em>}</li>
 *   <li>{@link fta_domain_model.Bracket#getBracketID <em>Bracket ID</em>}</li>
 *   <li>{@link fta_domain_model.Bracket#getNumberOfMatches <em>Number Of Matches</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getBracket()
 * @model
 * @generated
 */
public interface Bracket extends EObject {
	/**
	 * Returns the value of the '<em><b>Rounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rounds</em>' attribute.
	 * @see #setRounds(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getBracket_Rounds()
	 * @model
	 * @generated
	 */
	int getRounds();

	/**
	 * Sets the value of the '{@link fta_domain_model.Bracket#getRounds <em>Rounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rounds</em>' attribute.
	 * @see #getRounds()
	 * @generated
	 */
	void setRounds(int value);

	/**
	 * Returns the value of the '<em><b>Bracket Side</b></em>' attribute.
	 * The literals are from the enumeration {@link fta_domain_model.BracketSide}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bracket Side</em>' attribute.
	 * @see fta_domain_model.BracketSide
	 * @see #setBracketSide(BracketSide)
	 * @see fta_domain_model.Fta_domain_modelPackage#getBracket_BracketSide()
	 * @model
	 * @generated
	 */
	BracketSide getBracketSide();

	/**
	 * Sets the value of the '{@link fta_domain_model.Bracket#getBracketSide <em>Bracket Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bracket Side</em>' attribute.
	 * @see fta_domain_model.BracketSide
	 * @see #getBracketSide()
	 * @generated
	 */
	void setBracketSide(BracketSide value);

	/**
	 * Returns the value of the '<em><b>Matches</b></em>' containment reference list.
	 * The list contents are of type {@link fta_domain_model.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' containment reference list.
	 * @see fta_domain_model.Fta_domain_modelPackage#getBracket_Matches()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Match> getMatches();

	/**
	 * Returns the value of the '<em><b>Bracket ID</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bracket ID</em>' attribute.
	 * @see #setBracketID(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getBracket_BracketID()
	 * @model default="0" required="true" derived="true"
	 * @generated
	 */
	int getBracketID();

	/**
	 * Sets the value of the '{@link fta_domain_model.Bracket#getBracketID <em>Bracket ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bracket ID</em>' attribute.
	 * @see #getBracketID()
	 * @generated
	 */
	void setBracketID(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Matches</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Matches</em>' attribute.
	 * @see fta_domain_model.Fta_domain_modelPackage#getBracket_NumberOfMatches()
	 * @model default="0" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumberOfMatches();

} // Bracket
