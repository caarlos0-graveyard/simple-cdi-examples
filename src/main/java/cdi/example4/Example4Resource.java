package cdi.example4;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Singleton
@Path("example4")
@Produces(MediaType.TEXT_PLAIN)
public class Example4Resource {
    @Inject
    private Example4 ex;

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
