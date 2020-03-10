/*
 * generated by Xtext 2.13.0
 */
package edu.ulibertadores.ide

import com.google.inject.Guice
import edu.ulibertadores.PyDslRepRuntimeModule
import edu.ulibertadores.PyDslRepStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class PyDslRepIdeSetup extends PyDslRepStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new PyDslRepRuntimeModule, new PyDslRepIdeModule))
	}
	
}
