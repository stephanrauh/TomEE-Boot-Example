package de.beyondjava.tomEEBootExample;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
 
@Stateless
@Path("/sample")
public class SampleController {
 
    @GET
    @Produces("text/plain")
    public String sample() {
        return "Hello World";
    }
}