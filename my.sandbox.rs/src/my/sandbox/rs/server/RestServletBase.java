package my.sandbox.rs.server;

import org.glassfish.jersey.CommonProperties;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.servlet.ServletContainer;

public class RestServletBase extends ServletContainer {

	private static final long serialVersionUID = 1L;

	public RestServletBase(final Class<?>... componentClasses) {
		super(new ResourceConfigBuilder()
				.property(CommonProperties.FEATURE_AUTO_DISCOVERY_DISABLE, true)
				.property(CommonProperties.METAINF_SERVICES_LOOKUP_DISABLE, true)
				.property(CommonProperties.MOXY_JSON_FEATURE_DISABLE, true)
				.register(JacksonFeature.class)
				.register(componentClasses).build());
	}

}
