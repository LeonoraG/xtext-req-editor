/*
 * generated by Xtext
 */
package eu.scasefp7.eclipse.reqeditor.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RqsDslStandaloneSetup extends RqsDslStandaloneSetupGenerated{

	public static void doSetup() {
		new RqsDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
