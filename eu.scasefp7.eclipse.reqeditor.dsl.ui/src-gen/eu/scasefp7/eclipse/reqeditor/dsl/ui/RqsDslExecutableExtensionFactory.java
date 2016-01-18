/*
 * generated by Xtext
 */
package eu.scasefp7.eclipse.reqeditor.dsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import eu.scasefp7.eclipse.reqeditor.dsl.ui.internal.RqsDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RqsDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return RqsDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return RqsDslActivator.getInstance().getInjector(RqsDslActivator.EU_SCASEFP7_ECLIPSE_REQEDITOR_DSL_RQSDSL);
	}
	
}
