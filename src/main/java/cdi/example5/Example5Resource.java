package cdi.example5;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Singleton
@Path("example5")
@Produces(MediaType.TEXT_PLAIN)
public class Example5Resource {
    @Inject
    private Example5 ex;

    @GET
    @Path("{message}")
    public String fire(@PathParam("message") String message) {
        ex.fire(message);
        return "Fired!";
    }
}
