/**
 */
package fta_domain_model.impl;

import fta_domain_model.FinalsFormat;
import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.League;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>League</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.impl.LeagueImpl#getNumberOfRounds <em>Number Of Rounds</em>}</li>
 *   <li>{@link fta_domain_model.impl.LeagueImpl#getFinalsFormat <em>Finals Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeagueImpl extends TournamentFormatImpl implements League {
	/**
	 * The default value of the '{@link #getNumberOfRounds() <em>Number Of Rounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRounds()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ROUNDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfRounds() <em>Number Of Rounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRounds()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRounds = NUMBER_OF_ROUNDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalsFormat() <em>Finals Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalsFormat()
	 * @generated
	 * @ordered
	 */
	protected static final FinalsFormat FINALS_FORMAT_EDEFAULT = FinalsFormat.SINGLE_FINAL;

	/**
	 * The cached value of the '{@link #getFinalsFormat() <em>Finals Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalsFormat()
	 * @generated
	 * @ordered
	 */
	protected FinalsFormat finalsFormat = FINALS_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeagueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.LEAGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfRounds() {
		return numberOfRounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfRounds(int newNumberOfRounds) {
		int oldNumberOfRounds = numberOfRounds;
		numberOfRounds = newNumberOfRounds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.LEAGUE__NUMBER_OF_ROUNDS,
					oldNumberOfRounds, numberOfRounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalsFormat getFinalsFormat() {
		return finalsFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinalsFormat(FinalsFormat newFinalsFormat) {
		FinalsFormat oldFinalsFormat = finalsFormat;
		finalsFormat = newFinalsFormat == null ? FINALS_FORMAT_EDEFAULT : newFinalsFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.LEAGUE__FINALS_FORMAT,
					oldFinalsFormat, finalsFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fta_domain_modelPackage.LEAGUE__NUMBER_OF_ROUNDS:
			return getNumberOfRounds();
		case Fta_domain_modelPackage.LEAGUE__FINALS_FORMAT:
			return getFinalsFormat();
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
		case Fta_domain_modelPackage.LEAGUE__NUMBER_OF_ROUNDS:
			setNumberOfRounds((Integer) newValue);
			return;
		case Fta_domain_modelPackage.LEAGUE__FINALS_FORMAT:
			setFinalsFormat((FinalsFormat) newValue);
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
		case Fta_domain_modelPackage.LEAGUE__NUMBER_OF_ROUNDS:
			setNumberOfRounds(NUMBER_OF_ROUNDS_EDEFAULT);
			return;
		case Fta_domain_modelPackage.LEAGUE__FINALS_FORMAT:
			setFinalsFormat(FINALS_FORMAT_EDEFAULT);
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
		case Fta_domain_modelPackage.LEAGUE__NUMBER_OF_ROUNDS:
			return numberOfRounds != NUMBER_OF_ROUNDS_EDEFAULT;
		case Fta_domain_modelPackage.LEAGUE__FINALS_FORMAT:
			return finalsFormat != FINALS_FORMAT_EDEFAULT;
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
		result.append(" (numberOfRounds: ");
		result.append(numberOfRounds);
		result.append(", finalsFormat: ");
		result.append(finalsFormat);
		result.append(')');
		return result.toString();
	}

} //LeagueImpl
