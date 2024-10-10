/**
 */
package fta_domain_model.impl;

import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.TournamentFormat;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tournament Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.impl.TournamentFormatImpl#getName <em>Name</em>}</li>
 *   <li>{@link fta_domain_model.impl.TournamentFormatImpl#getMaxTeams <em>Max Teams</em>}</li>
 *   <li>{@link fta_domain_model.impl.TournamentFormatImpl#getMinTeams <em>Min Teams</em>}</li>
 *   <li>{@link fta_domain_model.impl.TournamentFormatImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TournamentFormatImpl extends MinimalEObjectImpl.Container implements TournamentFormat {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTeams() <em>Max Teams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTeams()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TEAMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxTeams() <em>Max Teams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTeams()
	 * @generated
	 * @ordered
	 */
	protected int maxTeams = MAX_TEAMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTeams() <em>Min Teams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTeams()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_TEAMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinTeams() <em>Min Teams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTeams()
	 * @generated
	 * @ordered
	 */
	protected int minTeams = MIN_TEAMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TournamentFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.TOURNAMENT_FORMAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.TOURNAMENT_FORMAT__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxTeams() {
		return maxTeams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTeams(int newMaxTeams) {
		int oldMaxTeams = maxTeams;
		maxTeams = newMaxTeams;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.TOURNAMENT_FORMAT__MAX_TEAMS,
					oldMaxTeams, maxTeams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinTeams() {
		return minTeams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinTeams(int newMinTeams) {
		int oldMinTeams = minTeams;
		minTeams = newMinTeams;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.TOURNAMENT_FORMAT__MIN_TEAMS,
					oldMinTeams, minTeams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Fta_domain_modelPackage.TOURNAMENT_FORMAT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fta_domain_modelPackage.TOURNAMENT_FORMAT__NAME:
			return getName();
		case Fta_domain_modelPackage.TOURNAMENT_FORMAT__MAX_TEAMS:
			return getMaxTeams();
		case Fta_domain_modelPackage.TOURNAMENT_FORMAT__MIN_TEAMS:
			return getMinTeams();
		case Fta_domain_modelPackage.TOURNAMENT_FORMAT__DESCRIPTION:
			return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Fta_domain_modelPackage.TOURNAMENT_FORMAT__NAME:
			setName((String) newValue);
			return;
		case Fta_domain_modelPackage.TOURNAMENT_FORMAT__MAX_TEAMS:
			setMaxTeams((Integer) newValue);
			return;
		case Fta_domain_modelPackage.TOURNAMENT_FORMAT__MIN_TEAMS:
			setMinTeams((Integer) newValue);
			return;
		case Fta_domain_modelPackage.TOURNAMENT_FORMAT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Fta_domain_modelPackage.TOURNAMENT_FORMAT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Fta_domain_modelPackage.TOURNAMENT_FORMAT__MAX_TEAMS:
			setMaxTeams(MAX_TEAMS_EDEFAULT);
			return;
		case Fta_domain_modelPackage.TOURNAMENT_FORMAT__MIN_TEAMS:
			setMinTeams(MIN_TEAMS_EDEFAULT);
			return;
		case Fta_domain_modelPackage.TOURNAMENT_FORMAT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Fta_domain_modelPackage.TOURNAMENT_FORMAT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Fta_domain_modelPackage.TOURNAMENT_FORMAT__MAX_TEAMS:
			return maxTeams != MAX_TEAMS_EDEFAULT;
		case Fta_domain_modelPackage.TOURNAMENT_FORMAT__MIN_TEAMS:
			return minTeams != MIN_TEAMS_EDEFAULT;
		case Fta_domain_modelPackage.TOURNAMENT_FORMAT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", maxTeams: ");
		result.append(maxTeams);
		result.append(", minTeams: ");
		result.append(minTeams);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TournamentFormatImpl
