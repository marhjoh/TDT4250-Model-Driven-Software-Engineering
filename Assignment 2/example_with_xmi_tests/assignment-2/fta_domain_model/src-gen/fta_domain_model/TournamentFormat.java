/**
 */
package fta_domain_model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tournament Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.TournamentFormat#getName <em>Name</em>}</li>
 *   <li>{@link fta_domain_model.TournamentFormat#getMaxTeams <em>Max Teams</em>}</li>
 *   <li>{@link fta_domain_model.TournamentFormat#getMinTeams <em>Min Teams</em>}</li>
 *   <li>{@link fta_domain_model.TournamentFormat#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getTournamentFormat()
 * @model abstract="true"
 * @generated
 */
public interface TournamentFormat extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fta_domain_model.Fta_domain_modelPackage#getTournamentFormat_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fta_domain_model.TournamentFormat#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Max Teams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Teams</em>' attribute.
	 * @see #setMaxTeams(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getTournamentFormat_MaxTeams()
	 * @model
	 * @generated
	 */
	int getMaxTeams();

	/**
	 * Sets the value of the '{@link fta_domain_model.TournamentFormat#getMaxTeams <em>Max Teams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Teams</em>' attribute.
	 * @see #getMaxTeams()
	 * @generated
	 */
	void setMaxTeams(int value);

	/**
	 * Returns the value of the '<em><b>Min Teams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Teams</em>' attribute.
	 * @see #setMinTeams(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getTournamentFormat_MinTeams()
	 * @model
	 * @generated
	 */
	int getMinTeams();

	/**
	 * Sets the value of the '{@link fta_domain_model.TournamentFormat#getMinTeams <em>Min Teams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Teams</em>' attribute.
	 * @see #getMinTeams()
	 * @generated
	 */
	void setMinTeams(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fta_domain_model.Fta_domain_modelPackage#getTournamentFormat_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fta_domain_model.TournamentFormat#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // TournamentFormat
