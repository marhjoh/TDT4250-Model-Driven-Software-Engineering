/**
 */
package fta_domain_model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attacker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.Attacker#getSprintSpeed <em>Sprint Speed</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getAttacker()
 * @model
 * @generated
 */
public interface Attacker extends PlayerStatistics {

	/**
	 * Returns the value of the '<em><b>Sprint Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sprint speed in km/t.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sprint Speed</em>' attribute.
	 * @see #setSprintSpeed(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getAttacker_SprintSpeed()
	 * @model
	 * @generated
	 */
	int getSprintSpeed();

	/**
	 * Sets the value of the '{@link fta_domain_model.Attacker#getSprintSpeed <em>Sprint Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sprint Speed</em>' attribute.
	 * @see #getSprintSpeed()
	 * @generated
	 */
	void setSprintSpeed(int value);
} // Attacker
