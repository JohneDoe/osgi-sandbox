package my.sandbox.rs.context;

import static my.sandbox.rs.context.RsServletContextHelper.CONTEXT_NAME;
import static my.sandbox.rs.context.ApiConstants.CATCH_ALL_PATTERN;
import static org.osgi.service.http.whiteboard.HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME;
import static org.osgi.service.http.whiteboard.HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_SELECT;
import static org.osgi.service.http.whiteboard.HttpWhiteboardConstants.HTTP_WHITEBOARD_SERVLET_PATTERN;

import javax.servlet.Servlet;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

@Component(service = Servlet.class, scope = ServiceScope.SINGLETON, property = {
		HTTP_WHITEBOARD_SERVLET_PATTERN + "=" + CATCH_ALL_PATTERN,
		HTTP_WHITEBOARD_CONTEXT_SELECT + "=(" + HTTP_WHITEBOARD_CONTEXT_NAME + "=" + CONTEXT_NAME + ")" })
public class RestServlet extends ServletContainer {

	private static final long serialVersionUID = 1L;

	public RestServlet() {
		super(new ResourceConfig(Resource1.class));
	}

	@Activate
	private void activate() {
		System.out.println("Activate");
		System.out.println("http://localhost:8080/rs/value");
		System.out.println("http://localhost:8080/system/console/httpservice");
		System.out.println("http://localhost:8080/system/console/bundles");

	}
}
