/**
 */
package fta_domain_model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extra Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.ExtraTime#isExtraTime <em>Extra Time</em>}</li>
 *   <li>{@link fta_domain_model.ExtraTime#getExtraTimeDuration <em>Extra Time Duration</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getExtraTime()
 * @model
 * @generated
 */
public interface ExtraTime extends MatchRules {
	/**
	 * Returns the value of the '<em><b>Extra Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Time</em>' attribute.
	 * @see #setExtraTime(boolean)
	 * @see fta_domain_model.Fta_domain_modelPackage#getExtraTime_ExtraTime()
	 * @model
	 * @generated
	 */
	boolean isExtraTime();

	/**
	 * Sets the value of the '{@link fta_domain_model.ExtraTime#isExtraTime <em>Extra Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Time</em>' attribute.
	 * @see #isExtraTime()
	 * @generated
	 */
	void setExtraTime(boolean value);

	/**
	 * Returns the value of the '<em><b>Extra Time Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Time Duration</em>' attribute.
	 * @see #setExtraTimeDuration(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getExtraTime_ExtraTimeDuration()
	 * @model
	 * @generated
	 */
	int getExtraTimeDuration();

	/**
	 * Sets the value of the '{@link fta_domain_model.ExtraTime#getExtraTimeDuration <em>Extra Time Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Time Duration</em>' attribute.
	 * @see #getExtraTimeDuration()
	 * @generated
	 */
	void setExtraTimeDuration(int value);

} // ExtraTime
