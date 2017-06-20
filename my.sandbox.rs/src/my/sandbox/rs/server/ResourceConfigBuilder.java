package my.sandbox.rs.server;

import org.glassfish.jersey.server.ResourceConfig;


public class ResourceConfigBuilder {

	private final ResourceConfig config;

	public ResourceConfigBuilder() {
		config = new ResourceConfig();
	}


	public ResourceConfigBuilder(final ResourceConfig config) {
		this.config = config;
	}


	public ResourceConfigBuilder property(final String name, final Object value) {
		config.property(name, value);
		return this;
	}


	public ResourceConfigBuilder register(final Class<?> componentClass) {
		config.register(componentClass);
		return this;
	}


	public ResourceConfigBuilder register(final Class<?>... componentClasses) {
		for (final Class<?> cls : componentClasses) {
			config.register(cls);
		}
		return this;
	}


	public ResourceConfigBuilder register(final Class<?> componentClass, final Class<?>... contracts) {
		config.register(componentClass, contracts);
		return this;
	}


	public ResourceConfigBuilder register(final Object component) {
		config.register(component);

		return this;
	}


	public ResourceConfigBuilder register(final Object component, final Class<?>... contracts) {
		config.register(component, contracts);

		return this;
	}


	public ResourceConfig build() {
		return config;
	}
}
