package my.sandbox.rs.server.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/value")
public class ExampleResource {

	@GET
	public Response getValue() {

		return Response.ok().entity("Thank you!").build();

	}

}
