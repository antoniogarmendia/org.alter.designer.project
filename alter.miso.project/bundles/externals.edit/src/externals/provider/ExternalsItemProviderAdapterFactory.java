/**
 */
package externals.provider;

import externals.util.ExternalsAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalsItemProviderAdapterFactory extends ExternalsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootItemProvider externalsRootItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAdapter() {
		if (externalsRootItemProvider == null) {
			externalsRootItemProvider = new ExternalsRootItemProvider(this);
		}

		return externalsRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemProvider externalsRootAPIDescriptionsItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsAdapter() {
		if (externalsRootAPIDescriptionsItemProvider == null) {
			externalsRootAPIDescriptionsItemProvider = new ExternalsRootAPIDescriptionsItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItems} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsItemProvider externalsRootAPIDescriptionsItemsItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsAdapter() {
		if (externalsRootAPIDescriptionsItemsItemProvider == null) {
			externalsRootAPIDescriptionsItemsItemProvider = new ExternalsRootAPIDescriptionsItemsItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsName} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsNameItemProvider externalsRootAPIDescriptionsItemsNameItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsNameAdapter() {
		if (externalsRootAPIDescriptionsItemsNameItemProvider == null) {
			externalsRootAPIDescriptionsItemsNameItemProvider = new ExternalsRootAPIDescriptionsItemsNameItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsNameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsProtocol} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsProtocolItemProvider externalsRootAPIDescriptionsItemsProtocolItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsProtocolAdapter() {
		if (externalsRootAPIDescriptionsItemsProtocolItemProvider == null) {
			externalsRootAPIDescriptionsItemsProtocolItemProvider = new ExternalsRootAPIDescriptionsItemsProtocolItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsProtocolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsUrl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsUrlItemProvider externalsRootAPIDescriptionsItemsUrlItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsUrl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsUrlAdapter() {
		if (externalsRootAPIDescriptionsItemsUrlItemProvider == null) {
			externalsRootAPIDescriptionsItemsUrlItemProvider = new ExternalsRootAPIDescriptionsItemsUrlItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsUrlItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsPaths} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsPathsItemProvider externalsRootAPIDescriptionsItemsPathsItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsPaths}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsPathsAdapter() {
		if (externalsRootAPIDescriptionsItemsPathsItemProvider == null) {
			externalsRootAPIDescriptionsItemsPathsItemProvider = new ExternalsRootAPIDescriptionsItemsPathsItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsPathsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsPathsItems} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsPathsItemsItemProvider externalsRootAPIDescriptionsItemsPathsItemsItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsPathsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsAdapter() {
		if (externalsRootAPIDescriptionsItemsPathsItemsItemProvider == null) {
			externalsRootAPIDescriptionsItemsPathsItemsItemProvider = new ExternalsRootAPIDescriptionsItemsPathsItemsItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsPathsItemsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsRoute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsPathsItemsRouteItemProvider externalsRootAPIDescriptionsItemsPathsItemsRouteItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsRoute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsRouteAdapter() {
		if (externalsRootAPIDescriptionsItemsPathsItemsRouteItemProvider == null) {
			externalsRootAPIDescriptionsItemsPathsItemsRouteItemProvider = new ExternalsRootAPIDescriptionsItemsPathsItemsRouteItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsPathsItemsRouteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParameters} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemProvider externalsRootAPIDescriptionsItemsPathsItemsParametersItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParameters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsParametersAdapter() {
		if (externalsRootAPIDescriptionsItemsPathsItemsParametersItemProvider == null) {
			externalsRootAPIDescriptionsItemsPathsItemsParametersItemProvider = new ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsPathsItemsParametersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsItemProvider externalsRootAPIDescriptionsItemsPathsItemsParametersItemsItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAdapter() {
		if (externalsRootAPIDescriptionsItemsPathsItemsParametersItemsItemProvider == null) {
			externalsRootAPIDescriptionsItemsPathsItemsParametersItemsItemProvider = new ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsPathsItemsParametersItemsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameItemProvider externalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAdapter() {
		if (externalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameItemProvider == null) {
			externalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameItemProvider = new ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeItemProvider externalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeAdapter() {
		if (externalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeItemProvider == null) {
			externalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeItemProvider = new ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemProvider externalsRootAPIDescriptionsItemsPathsItemsOutputsItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsOutputsAdapter() {
		if (externalsRootAPIDescriptionsItemsPathsItemsOutputsItemProvider == null) {
			externalsRootAPIDescriptionsItemsPathsItemsOutputsItemProvider = new ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsPathsItemsOutputsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsItemProvider externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAdapter() {
		if (externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsItemProvider == null) {
			externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsItemProvider = new ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameItemProvider externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAdapter() {
		if (externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameItemProvider == null) {
			externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameItemProvider = new ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeItemProvider externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeAdapter() {
		if (externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeItemProvider == null) {
			externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeItemProvider = new ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathItemProvider externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathAdapter() {
		if (externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathItemProvider == null) {
			externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathItemProvider = new ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsAPIAuth} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsAPIAuthItemProvider externalsRootAPIDescriptionsItemsAPIAuthItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsAPIAuth}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsAPIAuthAdapter() {
		if (externalsRootAPIDescriptionsItemsAPIAuthItemProvider == null) {
			externalsRootAPIDescriptionsItemsAPIAuthItemProvider = new ExternalsRootAPIDescriptionsItemsAPIAuthItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsAPIAuthItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsAPIAuthItemsItemProvider externalsRootAPIDescriptionsItemsAPIAuthItemsItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsAPIAuthItemsAdapter() {
		if (externalsRootAPIDescriptionsItemsAPIAuthItemsItemProvider == null) {
			externalsRootAPIDescriptionsItemsAPIAuthItemsItemProvider = new ExternalsRootAPIDescriptionsItemsAPIAuthItemsItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsAPIAuthItemsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsName} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsAPIAuthItemsNameItemProvider externalsRootAPIDescriptionsItemsAPIAuthItemsNameItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAdapter() {
		if (externalsRootAPIDescriptionsItemsAPIAuthItemsNameItemProvider == null) {
			externalsRootAPIDescriptionsItemsAPIAuthItemsNameItemProvider = new ExternalsRootAPIDescriptionsItemsAPIAuthItemsNameItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsAPIAuthItemsNameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyItemProvider externalsRootAPIDescriptionsItemsAPIAuthItemsKeyItemProvider;

	/**
	 * This creates an adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyAdapter() {
		if (externalsRootAPIDescriptionsItemsAPIAuthItemsKeyItemProvider == null) {
			externalsRootAPIDescriptionsItemsAPIAuthItemsKeyItemProvider = new ExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyItemProvider(this);
		}

		return externalsRootAPIDescriptionsItemsAPIAuthItemsKeyItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (externalsRootItemProvider != null) externalsRootItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemProvider != null) externalsRootAPIDescriptionsItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsItemProvider != null) externalsRootAPIDescriptionsItemsItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsNameItemProvider != null) externalsRootAPIDescriptionsItemsNameItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsProtocolItemProvider != null) externalsRootAPIDescriptionsItemsProtocolItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsUrlItemProvider != null) externalsRootAPIDescriptionsItemsUrlItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsPathsItemProvider != null) externalsRootAPIDescriptionsItemsPathsItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsPathsItemsItemProvider != null) externalsRootAPIDescriptionsItemsPathsItemsItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsPathsItemsRouteItemProvider != null) externalsRootAPIDescriptionsItemsPathsItemsRouteItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsPathsItemsParametersItemProvider != null) externalsRootAPIDescriptionsItemsPathsItemsParametersItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsPathsItemsParametersItemsItemProvider != null) externalsRootAPIDescriptionsItemsPathsItemsParametersItemsItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameItemProvider != null) externalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeItemProvider != null) externalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsPathsItemsOutputsItemProvider != null) externalsRootAPIDescriptionsItemsPathsItemsOutputsItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsItemProvider != null) externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameItemProvider != null) externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeItemProvider != null) externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathItemProvider != null) externalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsAPIAuthItemProvider != null) externalsRootAPIDescriptionsItemsAPIAuthItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsAPIAuthItemsItemProvider != null) externalsRootAPIDescriptionsItemsAPIAuthItemsItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsAPIAuthItemsNameItemProvider != null) externalsRootAPIDescriptionsItemsAPIAuthItemsNameItemProvider.dispose();
		if (externalsRootAPIDescriptionsItemsAPIAuthItemsKeyItemProvider != null) externalsRootAPIDescriptionsItemsAPIAuthItemsKeyItemProvider.dispose();
	}

}
