/*
 * generated by Xtext 2.23.0
 */
package externals.externals;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class ExternalsStandaloneSetup extends ExternalsStandaloneSetupGenerated {

	public static void doSetup() {
		new ExternalsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
