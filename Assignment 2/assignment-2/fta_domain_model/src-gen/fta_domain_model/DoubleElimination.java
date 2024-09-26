/**
 */
package fta_domain_model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Elimination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.DoubleElimination#getNumberOfRounds <em>Number Of Rounds</em>}</li>
 *   <li>{@link fta_domain_model.DoubleElimination#getFinalsFormat <em>Finals Format</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getDoubleElimination()
 * @model
 * @generated
 */
public interface DoubleElimination extends TournamentFormat {
	/**
	 * Returns the value of the '<em><b>Number Of Rounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Rounds</em>' attribute.
	 * @see #setNumberOfRounds(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getDoubleElimination_NumberOfRounds()
	 * @model
	 * @generated
	 */
	int getNumberOfRounds();

	/**
	 * Sets the value of the '{@link fta_domain_model.DoubleElimination#getNumberOfRounds <em>Number Of Rounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Rounds</em>' attribute.
	 * @see #getNumberOfRounds()
	 * @generated
	 */
	void setNumberOfRounds(int value);

	/**
	 * Returns the value of the '<em><b>Finals Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finals Format</em>' attribute.
	 * @see #setFinalsFormat(String)
	 * @see fta_domain_model.Fta_domain_modelPackage#getDoubleElimination_FinalsFormat()
	 * @model
	 * @generated
	 */
	String getFinalsFormat();

	/**
	 * Sets the value of the '{@link fta_domain_model.DoubleElimination#getFinalsFormat <em>Finals Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finals Format</em>' attribute.
	 * @see #getFinalsFormat()
	 * @generated
	 */
	void setFinalsFormat(String value);

} // DoubleElimination
