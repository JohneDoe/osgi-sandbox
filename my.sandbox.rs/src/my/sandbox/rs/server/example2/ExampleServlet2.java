package my.sandbox.rs.server.example2;

import javax.servlet.Servlet;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

import my.sandbox.rs.server.RestServletBase;

@Component(service = Servlet.class, scope = ServiceScope.SINGLETON, property = "osgi.http.whiteboard.servlet.pattern=/example2/*")
public class ExampleServlet2 extends RestServletBase {

	private static final long serialVersionUID = 1L;

	public ExampleServlet2() {
		super(ExampleResource2.class);
	}

	@Activate
	private void activate() {
		System.out.println("Activate");
		System.out.println("http://localhost:8080/example2/value");
		System.out.println("http://localhost:8080/system/console/httpservice");
		System.out.println("http://localhost:8080/system/console/bundles");

	}
}
