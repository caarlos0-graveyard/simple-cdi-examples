package cdi.example2;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Singleton
@Path("example2")
public class Example2Resource {
    @Inject
    private Example2 ex;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return String.format("Is this running on a **REAL** OS? %s", ex.get());
    }
}
