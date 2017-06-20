package my.sandbox.rs.context;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/value")
public class Resource1 {

	@GET
	public Response getValue() {
	//	org.apache.felix.http.base.internal.whiteboard.FailureStateHandler 
		return Response.ok().entity("Thank you!").build();

	}

}
