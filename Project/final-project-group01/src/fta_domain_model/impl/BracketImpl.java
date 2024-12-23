/**
 */
package fta_domain_model.impl;

import fta_domain_model.Bracket;
import fta_domain_model.BracketSide;
import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.Match;
import fta_domain_model.Tournament;

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
 * An implementation of the model object '<em><b>Bracket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.impl.BracketImpl#getRounds <em>Rounds</em>}</li>
 *   <li>{@link fta_domain_model.impl.BracketImpl#getBracketSide <em>Bracket Side</em>}</li>
 *   <li>{@link fta_domain_model.impl.BracketImpl#getMatches <em>Matches</em>}</li>
 *   <li>{@link fta_domain_model.impl.BracketImpl#getBracketID <em>Bracket ID</em>}</li>
 *   <li>{@link fta_domain_model.impl.BracketImpl#getNumberOfMatches <em>Number Of Matches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BracketImpl extends MinimalEObjectImpl.Container implements Bracket {

	/**
	 * The default value of the '{@link #getRounds() <em>Rounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRounds()
	 * @generated
	 * @ordered
	 */
	protected static final int ROUNDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRounds() <em>Rounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRounds()
	 * @generated
	 * @ordered
	 */
	protected int rounds = ROUNDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBracketSide() <em>Bracket Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBracketSide()
	 * @generated
	 * @ordered
	 */
	protected static final BracketSide BRACKET_SIDE_EDEFAULT = BracketSide.UPPER;

	/**
	 * The cached value of the '{@link #getBracketSide() <em>Bracket Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBracketSide()
	 * @generated
	 * @ordered
	 */
	protected BracketSide bracketSide = BRACKET_SIDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matches;

	/**
	 * The default value of the '{@link #getBracketID() <em>Bracket ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBracketID()
	 * @generated
	 * @ordered
	 */
	protected static final int BRACKET_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBracketID() <em>Bracket ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBracketID()
	 * @generated
	 * @ordered
	 */
	protected int bracketID = BRACKET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfMatches() <em>Number Of Matches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfMatches()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_MATCHES_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BracketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.BRACKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRounds() {
		return rounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRounds(int newRounds) {
		int oldRounds = rounds;
		rounds = newRounds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.BRACKET__ROUNDS, oldRounds,
					rounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BracketSide getBracketSide() {
		return bracketSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBracketSide(BracketSide newBracketSide) {
		BracketSide oldBracketSide = bracketSide;
		bracketSide = newBracketSide == null ? BRACKET_SIDE_EDEFAULT : newBracketSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.BRACKET__BRACKET_SIDE,
					oldBracketSide, bracketSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Match> getMatches() {
		if (matches == null) {
			matches = new EObjectContainmentEList<Match>(Match.class, this, Fta_domain_modelPackage.BRACKET__MATCHES);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getBracketID() {
		if (this.eContainer() instanceof Tournament) {
			Tournament tournament = (Tournament) this.eContainer();
			return tournament.getBrackets().indexOf(this) + 1; // Assuming getBrackets() returns a list of Brackets
		}
		return 0; // Default if not contained in a Tournament
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBracketID(int newBracketID) {
		int oldBracketID = bracketID;
		bracketID = newBracketID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.BRACKET__BRACKET_ID,
					oldBracketID, bracketID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getNumberOfMatches() {
		if (matches.size() == 0 || matches.isEmpty()) {
			return 0;
		}
		return matches.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fta_domain_modelPackage.BRACKET__MATCHES:
			return ((InternalEList<?>) getMatches()).basicRemove(otherEnd, msgs);
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
		case Fta_domain_modelPackage.BRACKET__ROUNDS:
			return getRounds();
		case Fta_domain_modelPackage.BRACKET__BRACKET_SIDE:
			return getBracketSide();
		case Fta_domain_modelPackage.BRACKET__MATCHES:
			return getMatches();
		case Fta_domain_modelPackage.BRACKET__BRACKET_ID:
			return getBracketID();
		case Fta_domain_modelPackage.BRACKET__NUMBER_OF_MATCHES:
			return getNumberOfMatches();
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
		case Fta_domain_modelPackage.BRACKET__ROUNDS:
			setRounds((Integer) newValue);
			return;
		case Fta_domain_modelPackage.BRACKET__BRACKET_SIDE:
			setBracketSide((BracketSide) newValue);
			return;
		case Fta_domain_modelPackage.BRACKET__MATCHES:
			getMatches().clear();
			getMatches().addAll((Collection<? extends Match>) newValue);
			return;
		case Fta_domain_modelPackage.BRACKET__BRACKET_ID:
			setBracketID((Integer) newValue);
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
		case Fta_domain_modelPackage.BRACKET__ROUNDS:
			setRounds(ROUNDS_EDEFAULT);
			return;
		case Fta_domain_modelPackage.BRACKET__BRACKET_SIDE:
			setBracketSide(BRACKET_SIDE_EDEFAULT);
			return;
		case Fta_domain_modelPackage.BRACKET__MATCHES:
			getMatches().clear();
			return;
		case Fta_domain_modelPackage.BRACKET__BRACKET_ID:
			setBracketID(BRACKET_ID_EDEFAULT);
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
		case Fta_domain_modelPackage.BRACKET__ROUNDS:
			return rounds != ROUNDS_EDEFAULT;
		case Fta_domain_modelPackage.BRACKET__BRACKET_SIDE:
			return bracketSide != BRACKET_SIDE_EDEFAULT;
		case Fta_domain_modelPackage.BRACKET__MATCHES:
			return matches != null && !matches.isEmpty();
		case Fta_domain_modelPackage.BRACKET__BRACKET_ID:
			return bracketID != BRACKET_ID_EDEFAULT;
		case Fta_domain_modelPackage.BRACKET__NUMBER_OF_MATCHES:
			return getNumberOfMatches() != NUMBER_OF_MATCHES_EDEFAULT;
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
		result.append(" (rounds: ");
		result.append(rounds);
		result.append(", bracketSide: ");
		result.append(bracketSide);
		result.append(", bracketID: ");
		result.append(bracketID);
		result.append(')');
		return result.toString();
	}

} //BracketImpl
