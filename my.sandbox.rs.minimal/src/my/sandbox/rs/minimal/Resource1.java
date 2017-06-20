package my.sandbox.rs.minimal;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/value")
public class Resource1 {

	@GET
	public Response getValue() {

		return Response.ok().entity("Thank you!").build();

	}

}
