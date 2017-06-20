package my.sandbox.rs.server.example2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/value")
public class ExampleResource2 {

	@GET
	public Response getValue() {

		return Response.ok().entity("Thank you!").build();

	}

}
