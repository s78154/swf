/**
 * generated by Xtext 2.13.0
 */
package beleg.ide;

import beleg.S78154S78236RuntimeModule;
import beleg.S78154S78236StandaloneSetup;
import beleg.ide.S78154S78236IdeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class S78154S78236IdeSetup extends S78154S78236StandaloneSetup {
  @Override
  public Injector createInjector() {
    S78154S78236RuntimeModule _s78154S78236RuntimeModule = new S78154S78236RuntimeModule();
    S78154S78236IdeModule _s78154S78236IdeModule = new S78154S78236IdeModule();
    return Guice.createInjector(Modules2.mixin(_s78154S78236RuntimeModule, _s78154S78236IdeModule));
  }
}
