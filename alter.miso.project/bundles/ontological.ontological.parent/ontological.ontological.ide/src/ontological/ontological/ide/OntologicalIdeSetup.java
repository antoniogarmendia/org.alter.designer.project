/*
 * generated by Xtext 2.23.0
 */
package ontological.ontological.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import ontological.ontological.OntologicalRuntimeModule;
import ontological.ontological.OntologicalStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class OntologicalIdeSetup extends OntologicalStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new OntologicalRuntimeModule(), new OntologicalIdeModule()));
	}
	
}
