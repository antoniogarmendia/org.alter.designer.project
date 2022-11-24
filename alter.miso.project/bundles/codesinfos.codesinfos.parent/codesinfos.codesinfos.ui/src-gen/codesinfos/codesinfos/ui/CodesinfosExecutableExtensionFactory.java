/*
 * generated by Xtext 2.23.0
 */
package codesinfos.codesinfos.ui;

import codesinfos.codesinfos.ui.internal.CodesinfosActivator;
import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CodesinfosExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(CodesinfosActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		CodesinfosActivator activator = CodesinfosActivator.getInstance();
		return activator != null ? activator.getInjector(CodesinfosActivator.CODESINFOS_CODESINFOS_CODESINFOS) : null;
	}

}