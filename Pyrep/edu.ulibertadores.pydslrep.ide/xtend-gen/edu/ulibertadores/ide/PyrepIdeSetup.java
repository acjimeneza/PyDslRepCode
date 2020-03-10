/**
 * generated by Xtext 2.13.0
 */
package edu.ulibertadores.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import edu.ulibertadores.PyDslRepRuntimeModule;
import edu.ulibertadores.PyDslRepStandaloneSetup;
import edu.ulibertadores.ide.PyDslRepIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class PyDslRepIdeSetup extends PyDslRepStandaloneSetup {
  @Override
  public Injector createInjector() {
    PyDslRepRuntimeModule _PyDslRepRuntimeModule = new PyDslRepRuntimeModule();
    PyDslRepIdeModule _PyDslRepIdeModule = new PyDslRepIdeModule();
    return Guice.createInjector(Modules2.mixin(_PyDslRepRuntimeModule, _PyDslRepIdeModule));
  }
}
