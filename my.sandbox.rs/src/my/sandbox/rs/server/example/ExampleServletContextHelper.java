package my.sandbox.rs.server.example;

import static my.sandbox.rs.server.example.ExampleConstants.PATH_SEPARATOR;
import static org.osgi.service.http.whiteboard.HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME;
import static org.osgi.service.http.whiteboard.HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_PATH;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.context.ServletContextHelper;

@Component(service = ServletContextHelper.class, property = {
		HTTP_WHITEBOARD_CONTEXT_NAME + "=" + ExampleServletContextHelper.CONTEXT_NAME,
		HTTP_WHITEBOARD_CONTEXT_PATH + "=" + PATH_SEPARATOR + ExampleServletContextHelper.CONTEXT_PATH })
public class ExampleServletContextHelper extends ServletContextHelper {
	public static final String CONTEXT_PATH = "example";
	public static final String CONTEXT_NAME = "rs.server.example";

}
