package my.sandbox.rs.server.example;

import static my.sandbox.rs.server.example.ExampleConstants.CATCH_ALL_PATTERN;
import static my.sandbox.rs.server.example.ExampleServletContextHelper.CONTEXT_NAME;
import static my.sandbox.rs.server.example.ExampleServletContextHelper.CONTEXT_PATH;
import static org.osgi.service.http.whiteboard.HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME;
import static org.osgi.service.http.whiteboard.HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_SELECT;
import static org.osgi.service.http.whiteboard.HttpWhiteboardConstants.HTTP_WHITEBOARD_SERVLET_PATTERN;

import javax.servlet.Servlet;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

import my.sandbox.rs.server.RestServletBase;

@Component(service = Servlet.class, scope = ServiceScope.SINGLETON, property = {
		HTTP_WHITEBOARD_SERVLET_PATTERN + "=" + CATCH_ALL_PATTERN,
		HTTP_WHITEBOARD_CONTEXT_SELECT + "=(" + HTTP_WHITEBOARD_CONTEXT_NAME + "=" + CONTEXT_NAME + ")" })
public class ExampleServlet extends RestServletBase {

	private static final long serialVersionUID = 1L;

	public ExampleServlet() {
		super(ExampleResource.class);
	}

	@Activate
	private void activate() {
		System.out.println("Activate");
		System.out.println("http://localhost:8080/" + CONTEXT_PATH + "/value");
		System.out.println("http://localhost:8080/system/console/httpservice");
		System.out.println("http://localhost:8080/system/console/bundles");

	}
}
