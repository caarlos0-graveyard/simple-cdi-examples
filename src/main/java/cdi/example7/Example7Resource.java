package cdi.example7;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Singleton
@Path("example7")
@Produces(MediaType.TEXT_PLAIN)
public class Example7Resource {

    @Inject
    private Example7 ex;

    @GET
    public String work() {
        return ex.work();
    }
}
