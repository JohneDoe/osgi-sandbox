package my.sandbox.rs.context;

import static my.sandbox.rs.context.ApiConstants.PATH_SEPARATOR;
import static org.osgi.service.http.whiteboard.HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME;
import static org.osgi.service.http.whiteboard.HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_PATH;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.context.ServletContextHelper;

@Component(service = ServletContextHelper.class, property = {
		HTTP_WHITEBOARD_CONTEXT_NAME + "=" + RsServletContextHelper.CONTEXT_NAME,
		HTTP_WHITEBOARD_CONTEXT_PATH + "=" + PATH_SEPARATOR + RsServletContextHelper.CONTEXT_PATH })
public class RsServletContextHelper extends ServletContextHelper {
	public static final String CONTEXT_PATH = "rs";
	public static final String CONTEXT_NAME = "my.sandbox.rs.context.rs";

}
