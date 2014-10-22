package cdi.example6;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Singleton
@TimeLogged
@Path("example6")
@Produces(MediaType.TEXT_PLAIN)
public class Example6Resource {

    @GET
    public String fire() {
        return "OK";
    }
}
