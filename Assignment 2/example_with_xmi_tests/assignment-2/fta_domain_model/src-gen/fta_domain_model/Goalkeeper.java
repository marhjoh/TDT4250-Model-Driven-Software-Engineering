/**
 */
package fta_domain_model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goalkeeper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.Goalkeeper#getCleansheets <em>Cleansheets</em>}</li>
 *   <li>{@link fta_domain_model.Goalkeeper#getSaves <em>Saves</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getGoalkeeper()
 * @model
 * @generated
 */
public interface Goalkeeper extends PlayerStatistics {
	/**
	 * Returns the value of the '<em><b>Cleansheets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cleansheets</em>' attribute.
	 * @see #setCleansheets(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getGoalkeeper_Cleansheets()
	 * @model
	 * @generated
	 */
	int getCleansheets();

	/**
	 * Sets the value of the '{@link fta_domain_model.Goalkeeper#getCleansheets <em>Cleansheets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cleansheets</em>' attribute.
	 * @see #getCleansheets()
	 * @generated
	 */
	void setCleansheets(int value);

	/**
	 * Returns the value of the '<em><b>Saves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saves</em>' attribute.
	 * @see #setSaves(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getGoalkeeper_Saves()
	 * @model
	 * @generated
	 */
	int getSaves();

	/**
	 * Sets the value of the '{@link fta_domain_model.Goalkeeper#getSaves <em>Saves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saves</em>' attribute.
	 * @see #getSaves()
	 * @generated
	 */
	void setSaves(int value);

} // Goalkeeper
