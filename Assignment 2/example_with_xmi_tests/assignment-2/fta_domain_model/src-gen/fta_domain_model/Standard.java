/**
 */
package fta_domain_model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.Standard#isTieBreaking <em>Tie Breaking</em>}</li>
 *   <li>{@link fta_domain_model.Standard#isExtraTime <em>Extra Time</em>}</li>
 *   <li>{@link fta_domain_model.Standard#isPentaltyShootouts <em>Pentalty Shootouts</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getStandard()
 * @model
 * @generated
 */
public interface Standard extends MatchRules {
	/**
	 * Returns the value of the '<em><b>Tie Breaking</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tie Breaking</em>' attribute.
	 * @see #setTieBreaking(boolean)
	 * @see fta_domain_model.Fta_domain_modelPackage#getStandard_TieBreaking()
	 * @model default="false"
	 * @generated
	 */
	boolean isTieBreaking();

	/**
	 * Sets the value of the '{@link fta_domain_model.Standard#isTieBreaking <em>Tie Breaking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tie Breaking</em>' attribute.
	 * @see #isTieBreaking()
	 * @generated
	 */
	void setTieBreaking(boolean value);

	/**
	 * Returns the value of the '<em><b>Extra Time</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Time</em>' attribute.
	 * @see #setExtraTime(boolean)
	 * @see fta_domain_model.Fta_domain_modelPackage#getStandard_ExtraTime()
	 * @model default="false"
	 * @generated
	 */
	boolean isExtraTime();

	/**
	 * Sets the value of the '{@link fta_domain_model.Standard#isExtraTime <em>Extra Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Time</em>' attribute.
	 * @see #isExtraTime()
	 * @generated
	 */
	void setExtraTime(boolean value);

	/**
	 * Returns the value of the '<em><b>Pentalty Shootouts</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pentalty Shootouts</em>' attribute.
	 * @see #setPentaltyShootouts(boolean)
	 * @see fta_domain_model.Fta_domain_modelPackage#getStandard_PentaltyShootouts()
	 * @model default="false"
	 * @generated
	 */
	boolean isPentaltyShootouts();

	/**
	 * Sets the value of the '{@link fta_domain_model.Standard#isPentaltyShootouts <em>Pentalty Shootouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pentalty Shootouts</em>' attribute.
	 * @see #isPentaltyShootouts()
	 * @generated
	 */
	void setPentaltyShootouts(boolean value);

} // Standard
