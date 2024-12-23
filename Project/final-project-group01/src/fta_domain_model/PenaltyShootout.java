/**
 */
package fta_domain_model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Penalty Shootout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.PenaltyShootout#isPentaltyShootouts <em>Pentalty Shootouts</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getPenaltyShootout()
 * @model
 * @generated
 */
public interface PenaltyShootout extends MatchRules {
	/**
	 * Returns the value of the '<em><b>Pentalty Shootouts</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pentalty Shootouts</em>' attribute.
	 * @see #setPentaltyShootouts(boolean)
	 * @see fta_domain_model.Fta_domain_modelPackage#getPenaltyShootout_PentaltyShootouts()
	 * @model default="false"
	 * @generated
	 */
	boolean isPentaltyShootouts();

	/**
	 * Sets the value of the '{@link fta_domain_model.PenaltyShootout#isPentaltyShootouts <em>Pentalty Shootouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pentalty Shootouts</em>' attribute.
	 * @see #isPentaltyShootouts()
	 * @generated
	 */
	void setPentaltyShootouts(boolean value);

} // PenaltyShootout
