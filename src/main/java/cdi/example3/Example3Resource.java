package cdi.example3;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Singleton
@Path("example3")
@Produces(MediaType.TEXT_PLAIN)
public class Example3Resource {
    @Inject
    private Example3 ex;

    @GET
    public String list() {
        return ex.creditCards();
    }

    @GET
    @Path("visa")
    public String visa() {
        return ex.visa();
    }

    @GET
    @Path("master")
    public String master() {
        return ex.master();
    }
}
