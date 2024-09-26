/**
 */
package fta_domain_model.provider;

import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.RoundRobin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fta_domain_model.RoundRobin} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoundRobinItemProvider extends TournamentFormatItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundRobinItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPointsForWinPropertyDescriptor(object);
			addPointsForDrawPropertyDescriptor(object);
			addPointsForLossPropertyDescriptor(object);
			addNumberOfRoundsPropertyDescriptor(object);
			addTieBreakerRulePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Points For Win feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointsForWinPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RoundRobin_pointsForWin_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RoundRobin_pointsForWin_feature",
								"_UI_RoundRobin_type"),
						Fta_domain_modelPackage.Literals.ROUND_ROBIN__POINTS_FOR_WIN, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Points For Draw feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointsForDrawPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RoundRobin_pointsForDraw_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RoundRobin_pointsForDraw_feature",
								"_UI_RoundRobin_type"),
						Fta_domain_modelPackage.Literals.ROUND_ROBIN__POINTS_FOR_DRAW, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Points For Loss feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointsForLossPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RoundRobin_pointsForLoss_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RoundRobin_pointsForLoss_feature",
								"_UI_RoundRobin_type"),
						Fta_domain_modelPackage.Literals.ROUND_ROBIN__POINTS_FOR_LOSS, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Number Of Rounds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfRoundsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RoundRobin_numberOfRounds_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RoundRobin_numberOfRounds_feature",
								"_UI_RoundRobin_type"),
						Fta_domain_modelPackage.Literals.ROUND_ROBIN__NUMBER_OF_ROUNDS, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Tie Breaker Rule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTieBreakerRulePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RoundRobin_tieBreakerRule_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RoundRobin_tieBreakerRule_feature",
								"_UI_RoundRobin_type"),
						Fta_domain_modelPackage.Literals.ROUND_ROBIN__TIE_BREAKER_RULE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns RoundRobin.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RoundRobin"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RoundRobin) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_RoundRobin_type")
				: getString("_UI_RoundRobin_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(RoundRobin.class)) {
		case Fta_domain_modelPackage.ROUND_ROBIN__POINTS_FOR_WIN:
		case Fta_domain_modelPackage.ROUND_ROBIN__POINTS_FOR_DRAW:
		case Fta_domain_modelPackage.ROUND_ROBIN__POINTS_FOR_LOSS:
		case Fta_domain_modelPackage.ROUND_ROBIN__NUMBER_OF_ROUNDS:
		case Fta_domain_modelPackage.ROUND_ROBIN__TIE_BREAKER_RULE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
