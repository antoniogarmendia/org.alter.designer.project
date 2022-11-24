/*
 * generated by Xtext 2.23.0
 */
package accesses.accesses.ide;

import accesses.accesses.AccessesRuntimeModule;
import accesses.accesses.AccessesStandaloneSetup;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class AccessesIdeSetup extends AccessesStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new AccessesRuntimeModule(), new AccessesIdeModule()));
	}
	
}
