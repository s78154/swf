/*
 * generated by Xtext 2.13.0
 */
package beleg.ui;

import com.google.inject.Injector;
import de.htwdd.sf.beleg.s78154s78236.ui.internal.S78154s78236Activator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class S78154S78236ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(S78154s78236Activator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		S78154s78236Activator activator = S78154s78236Activator.getInstance();
		return activator != null ? activator.getInjector(S78154s78236Activator.BELEG_S78154S78236) : null;
	}

}
