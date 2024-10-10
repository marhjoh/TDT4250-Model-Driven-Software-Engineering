/**
 */
package fta_domain_model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defender</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.Defender#getCleansheets <em>Cleansheets</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getDefender()
 * @model
 * @generated
 */
public interface Defender extends PlayerStatistics {
	/**
	 * Returns the value of the '<em><b>Cleansheets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cleansheets</em>' attribute.
	 * @see #setCleansheets(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getDefender_Cleansheets()
	 * @model
	 * @generated
	 */
	int getCleansheets();

	/**
	 * Sets the value of the '{@link fta_domain_model.Defender#getCleansheets <em>Cleansheets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cleansheets</em>' attribute.
	 * @see #getCleansheets()
	 * @generated
	 */
	void setCleansheets(int value);

} // Defender
