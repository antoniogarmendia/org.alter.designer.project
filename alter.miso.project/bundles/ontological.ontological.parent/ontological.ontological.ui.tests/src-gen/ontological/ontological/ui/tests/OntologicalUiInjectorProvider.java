/*
 * generated by Xtext 2.23.0
 */
package ontological.ontological.ui.tests;

import com.google.inject.Injector;
import ontological.ontological.ui.internal.OntologicalActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class OntologicalUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return OntologicalActivator.getInstance().getInjector("ontological.ontological.Ontological");
	}

}
