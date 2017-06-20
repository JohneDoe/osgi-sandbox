package my.sandbox.rs.minimal;

import javax.servlet.Servlet;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

@Component(service = Servlet.class, scope = ServiceScope.SINGLETON, property= "osgi.http.whiteboard.servlet.pattern=/rs/*")
public class RestServlet extends ServletContainer {

	private static final long serialVersionUID = 1L;
	public static final String CONTEXT_PATH = "example2";
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
