/**
 */
package fta_domain_model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Elimination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.SingleElimination#getNumberOfRounds <em>Number Of Rounds</em>}</li>
 *   <li>{@link fta_domain_model.SingleElimination#isHasThirdPlacePlayoff <em>Has Third Place Playoff</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getSingleElimination()
 * @model
 * @generated
 */
public interface SingleElimination extends TournamentFormat {
	/**
	 * Returns the value of the '<em><b>Number Of Rounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Rounds</em>' attribute.
	 * @see #setNumberOfRounds(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getSingleElimination_NumberOfRounds()
	 * @model
	 * @generated
	 */
	int getNumberOfRounds();

	/**
	 * Sets the value of the '{@link fta_domain_model.SingleElimination#getNumberOfRounds <em>Number Of Rounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Rounds</em>' attribute.
	 * @see #getNumberOfRounds()
	 * @generated
	 */
	void setNumberOfRounds(int value);

	/**
	 * Returns the value of the '<em><b>Has Third Place Playoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Third Place Playoff</em>' attribute.
	 * @see #setHasThirdPlacePlayoff(boolean)
	 * @see fta_domain_model.Fta_domain_modelPackage#getSingleElimination_HasThirdPlacePlayoff()
	 * @model
	 * @generated
	 */
	boolean isHasThirdPlacePlayoff();

	/**
	 * Sets the value of the '{@link fta_domain_model.SingleElimination#isHasThirdPlacePlayoff <em>Has Third Place Playoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Third Place Playoff</em>' attribute.
	 * @see #isHasThirdPlacePlayoff()
	 * @generated
	 */
	void setHasThirdPlacePlayoff(boolean value);

} // SingleElimination
