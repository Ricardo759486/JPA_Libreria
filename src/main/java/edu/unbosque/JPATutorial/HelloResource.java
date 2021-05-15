package edu.unbosque.JPATutorial;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/index.jsp")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
}