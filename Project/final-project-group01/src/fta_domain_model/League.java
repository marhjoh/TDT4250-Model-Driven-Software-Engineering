/**
 */
package fta_domain_model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>League</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.League#getNumberOfRounds <em>Number Of Rounds</em>}</li>
 *   <li>{@link fta_domain_model.League#getFinalsFormat <em>Finals Format</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getLeague()
 * @model
 * @generated
 */
public interface League extends TournamentFormat {
	/**
	 * Returns the value of the '<em><b>Number Of Rounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Rounds</em>' attribute.
	 * @see #setNumberOfRounds(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getLeague_NumberOfRounds()
	 * @model
	 * @generated
	 */
	int getNumberOfRounds();

	/**
	 * Sets the value of the '{@link fta_domain_model.League#getNumberOfRounds <em>Number Of Rounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Rounds</em>' attribute.
	 * @see #getNumberOfRounds()
	 * @generated
	 */
	void setNumberOfRounds(int value);

	/**
	 * Returns the value of the '<em><b>Finals Format</b></em>' attribute.
	 * The literals are from the enumeration {@link fta_domain_model.FinalsFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finals Format</em>' attribute.
	 * @see fta_domain_model.FinalsFormat
	 * @see #setFinalsFormat(FinalsFormat)
	 * @see fta_domain_model.Fta_domain_modelPackage#getLeague_FinalsFormat()
	 * @model
	 * @generated
	 */
	FinalsFormat getFinalsFormat();

	/**
	 * Sets the value of the '{@link fta_domain_model.League#getFinalsFormat <em>Finals Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finals Format</em>' attribute.
	 * @see fta_domain_model.FinalsFormat
	 * @see #getFinalsFormat()
	 * @generated
	 */
	void setFinalsFormat(FinalsFormat value);

} // League
