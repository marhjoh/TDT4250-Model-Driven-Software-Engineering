/**
 */
package fta_domain_model.provider;

import fta_domain_model.Fta_domain_modelFactory;
import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.Tournament;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fta_domain_model.Tournament} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TournamentItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TournamentItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addTournamentTypePropertyDescriptor(object);
			addMatchesPropertyDescriptor(object);
			addTeamsPropertyDescriptor(object);
			addTournamentformatPropertyDescriptor(object);
			addNumberOfTeamsPropertyDescriptor(object);
			addBracketsPropertyDescriptor(object);
			addDatastoragePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Tournament_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Tournament_name_feature",
								"_UI_Tournament_type"),
						Fta_domain_modelPackage.Literals.TOURNAMENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Tournament Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTournamentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Tournament_tournamentType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Tournament_tournamentType_feature",
								"_UI_Tournament_type"),
						Fta_domain_modelPackage.Literals.TOURNAMENT__TOURNAMENT_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Matches feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMatchesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Tournament_matches_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Tournament_matches_feature",
								"_UI_Tournament_type"),
						Fta_domain_modelPackage.Literals.TOURNAMENT__MATCHES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Teams feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTeamsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Tournament_teams_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Tournament_teams_feature",
								"_UI_Tournament_type"),
						Fta_domain_modelPackage.Literals.TOURNAMENT__TEAMS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Tournamentformat feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTournamentformatPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Tournament_tournamentformat_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Tournament_tournamentformat_feature",
								"_UI_Tournament_type"),
						Fta_domain_modelPackage.Literals.TOURNAMENT__TOURNAMENTFORMAT, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Number Of Teams feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfTeamsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Tournament_numberOfTeams_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Tournament_numberOfTeams_feature",
								"_UI_Tournament_type"),
						Fta_domain_modelPackage.Literals.TOURNAMENT__NUMBER_OF_TEAMS, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Brackets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBracketsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Tournament_brackets_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Tournament_brackets_feature",
								"_UI_Tournament_type"),
						Fta_domain_modelPackage.Literals.TOURNAMENT__BRACKETS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Datastorage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatastoragePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Tournament_datastorage_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Tournament_datastorage_feature",
								"_UI_Tournament_type"),
						Fta_domain_modelPackage.Literals.TOURNAMENT__DATASTORAGE, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Fta_domain_modelPackage.Literals.TOURNAMENT__MATCHES);
			childrenFeatures.add(Fta_domain_modelPackage.Literals.TOURNAMENT__BRACKETS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Tournament.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Tournament"));
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
		String label = ((Tournament) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Tournament_type")
				: getString("_UI_Tournament_type") + " " + label;
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

		switch (notification.getFeatureID(Tournament.class)) {
		case Fta_domain_modelPackage.TOURNAMENT__NAME:
		case Fta_domain_modelPackage.TOURNAMENT__TOURNAMENT_TYPE:
		case Fta_domain_modelPackage.TOURNAMENT__NUMBER_OF_TEAMS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Fta_domain_modelPackage.TOURNAMENT__MATCHES:
		case Fta_domain_modelPackage.TOURNAMENT__BRACKETS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(Fta_domain_modelPackage.Literals.TOURNAMENT__MATCHES,
				Fta_domain_modelFactory.eINSTANCE.createMatch()));

		newChildDescriptors.add(createChildParameter(Fta_domain_modelPackage.Literals.TOURNAMENT__BRACKETS,
				Fta_domain_modelFactory.eINSTANCE.createBracket()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Fta_domain_modelEditPlugin.INSTANCE;
	}

}
