/*
 * generated by Xtext 2.18.0.M3
 */
package edu.ulibertadores.ui;

import com.google.inject.Injector;
import edu.ulibertadores.PyDslRep.ui.internal.PyDslRepActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PyDslRepExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(PyDslRepActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		PyDslRepActivator activator = PyDslRepActivator.getInstance();
		return activator != null ? activator.getInjector(PyDslRepActivator.EDU_ULIBERTADORES_PyDslRep) : null;
	}

}
