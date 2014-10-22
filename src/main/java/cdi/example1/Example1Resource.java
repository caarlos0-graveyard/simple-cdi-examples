package cdi.example1;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Singleton
@Path("example1")
public class Example1Resource {
    @Inject
    private Example1 ex;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return ex.get();
    }
}
