/**
 */
package fta_domain_model.impl;

import fta_domain_model.Bracket;
import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.Team;
import fta_domain_model.Tournament;
import fta_domain_model.TournamentFormat;
import fta_domain_model.TournamentType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.impl.TournamentImpl#getName <em>Name</em>}</li>
 *   <li>{@link fta_domain_model.impl.TournamentImpl#getTournamentType <em>Tournament Type</em>}</li>
 *   <li>{@link fta_domain_model.impl.TournamentImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link fta_domain_model.impl.TournamentImpl#getTournamentformat <em>Tournamentformat</em>}</li>
 *   <li>{@link fta_domain_model.impl.TournamentImpl#getNumberOfTeams <em>Number Of Teams</em>}</li>
 *   <li>{@link fta_domain_model.impl.TournamentImpl#getBrackets <em>Brackets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TournamentImpl extends MinimalEObjectImpl.Container implements Tournament {
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
	 * The default value of the '{@link #getTournamentType() <em>Tournament Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournamentType()
	 * @generated
	 * @ordered
	 */
	protected static final TournamentType TOURNAMENT_TYPE_EDEFAULT = TournamentType.KNOCKOUT;

	/**
	 * The cached value of the '{@link #getTournamentType() <em>Tournament Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournamentType()
	 * @generated
	 * @ordered
	 */
	protected TournamentType tournamentType = TOURNAMENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> teams;

	/**
	 * The cached value of the '{@link #getTournamentformat() <em>Tournamentformat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournamentformat()
	 * @generated
	 * @ordered
	 */
	protected TournamentFormat tournamentformat;

	/**
	 * The default value of the '{@link #getNumberOfTeams() <em>Number Of Teams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTeams()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_TEAMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBrackets() <em>Brackets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrackets()
	 * @generated
	 * @ordered
	 */
	protected EList<Bracket> brackets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TournamentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.TOURNAMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.TOURNAMENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TournamentType getTournamentType() {
		return tournamentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTournamentType(TournamentType newTournamentType) {
		TournamentType oldTournamentType = tournamentType;
		tournamentType = newTournamentType == null ? TOURNAMENT_TYPE_EDEFAULT : newTournamentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.TOURNAMENT__TOURNAMENT_TYPE,
					oldTournamentType, tournamentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectContainmentEList<Team>(Team.class, this, Fta_domain_modelPackage.TOURNAMENT__TEAMS);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TournamentFormat getTournamentformat() {
		return tournamentformat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTournamentformat(TournamentFormat newTournamentformat, NotificationChain msgs) {
		TournamentFormat oldTournamentformat = tournamentformat;
		tournamentformat = newTournamentformat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fta_domain_modelPackage.TOURNAMENT__TOURNAMENTFORMAT, oldTournamentformat, newTournamentformat);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTournamentformat(TournamentFormat newTournamentformat) {
		if (newTournamentformat != tournamentformat) {
			NotificationChain msgs = null;
			if (tournamentformat != null)
				msgs = ((InternalEObject) tournamentformat).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Fta_domain_modelPackage.TOURNAMENT__TOURNAMENTFORMAT, null, msgs);
			if (newTournamentformat != null)
				msgs = ((InternalEObject) newTournamentformat).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Fta_domain_modelPackage.TOURNAMENT__TOURNAMENTFORMAT, null, msgs);
			msgs = basicSetTournamentformat(newTournamentformat, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.TOURNAMENT__TOURNAMENTFORMAT,
					newTournamentformat, newTournamentformat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getNumberOfTeams() {
		if (teams.size() == 0 || teams.isEmpty()) {
			return 0;
		}
		return teams.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bracket> getBrackets() {
		if (brackets == null) {
			brackets = new EObjectContainmentEList<Bracket>(Bracket.class, this,
					Fta_domain_modelPackage.TOURNAMENT__BRACKETS);
		}
		return brackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fta_domain_modelPackage.TOURNAMENT__TEAMS:
			return ((InternalEList<?>) getTeams()).basicRemove(otherEnd, msgs);
		case Fta_domain_modelPackage.TOURNAMENT__TOURNAMENTFORMAT:
			return basicSetTournamentformat(null, msgs);
		case Fta_domain_modelPackage.TOURNAMENT__BRACKETS:
			return ((InternalEList<?>) getBrackets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fta_domain_modelPackage.TOURNAMENT__NAME:
			return getName();
		case Fta_domain_modelPackage.TOURNAMENT__TOURNAMENT_TYPE:
			return getTournamentType();
		case Fta_domain_modelPackage.TOURNAMENT__TEAMS:
			return getTeams();
		case Fta_domain_modelPackage.TOURNAMENT__TOURNAMENTFORMAT:
			return getTournamentformat();
		case Fta_domain_modelPackage.TOURNAMENT__NUMBER_OF_TEAMS:
			return getNumberOfTeams();
		case Fta_domain_modelPackage.TOURNAMENT__BRACKETS:
			return getBrackets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Fta_domain_modelPackage.TOURNAMENT__NAME:
			setName((String) newValue);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__TOURNAMENT_TYPE:
			setTournamentType((TournamentType) newValue);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__TEAMS:
			getTeams().clear();
			getTeams().addAll((Collection<? extends Team>) newValue);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__TOURNAMENTFORMAT:
			setTournamentformat((TournamentFormat) newValue);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__BRACKETS:
			getBrackets().clear();
			getBrackets().addAll((Collection<? extends Bracket>) newValue);
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
		case Fta_domain_modelPackage.TOURNAMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__TOURNAMENT_TYPE:
			setTournamentType(TOURNAMENT_TYPE_EDEFAULT);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__TEAMS:
			getTeams().clear();
			return;
		case Fta_domain_modelPackage.TOURNAMENT__TOURNAMENTFORMAT:
			setTournamentformat((TournamentFormat) null);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__BRACKETS:
			getBrackets().clear();
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
		case Fta_domain_modelPackage.TOURNAMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Fta_domain_modelPackage.TOURNAMENT__TOURNAMENT_TYPE:
			return tournamentType != TOURNAMENT_TYPE_EDEFAULT;
		case Fta_domain_modelPackage.TOURNAMENT__TEAMS:
			return teams != null && !teams.isEmpty();
		case Fta_domain_modelPackage.TOURNAMENT__TOURNAMENTFORMAT:
			return tournamentformat != null;
		case Fta_domain_modelPackage.TOURNAMENT__NUMBER_OF_TEAMS:
			return getNumberOfTeams() != NUMBER_OF_TEAMS_EDEFAULT;
		case Fta_domain_modelPackage.TOURNAMENT__BRACKETS:
			return brackets != null && !brackets.isEmpty();
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
		result.append(", tournamentType: ");
		result.append(tournamentType);
		result.append(')');
		return result.toString();
	}

} //TournamentImpl
