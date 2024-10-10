/**
 */
package fta_domain_model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.GroupStage#isTieBreaking <em>Tie Breaking</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getGroupStage()
 * @model
 * @generated
 */
public interface GroupStage extends MatchRules {
	/**
	 * Returns the value of the '<em><b>Tie Breaking</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tie Breaking</em>' attribute.
	 * @see #setTieBreaking(boolean)
	 * @see fta_domain_model.Fta_domain_modelPackage#getGroupStage_TieBreaking()
	 * @model default="true"
	 * @generated
	 */
	boolean isTieBreaking();

	/**
	 * Sets the value of the '{@link fta_domain_model.GroupStage#isTieBreaking <em>Tie Breaking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tie Breaking</em>' attribute.
	 * @see #isTieBreaking()
	 * @generated
	 */
	void setTieBreaking(boolean value);

} // GroupStage
