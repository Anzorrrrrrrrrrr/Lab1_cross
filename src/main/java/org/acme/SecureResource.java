package org.acme;

import io.quarkus.security.Authenticated;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/secure")
@Authenticated
public class SecureResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String secure() {
        return "SECURE DATA";
    }
}
