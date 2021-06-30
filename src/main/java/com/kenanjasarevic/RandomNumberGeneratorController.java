package com.kenanjasarevic;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Random;

@Path("/")
public class RandomNumberGeneratorController {

    @GET
    @Path("api")
    @Produces(MediaType.TEXT_PLAIN)
    public Response randomGenerator() {
        Random rand = new Random();
        int upperbound = 101;
        // generate random values from 0-24
        int random = rand.nextInt(upperbound);
        return Response
                .status(Response.Status.OK)
                .entity(String.valueOf(random))
                .build();
    }
}
