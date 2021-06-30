package com.kenanjasarevic;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Random;

//@Path("api")
public class RandomNumberGeneratorController {

    @GET
    @Path("/api")
    @Produces(MediaType.TEXT_PLAIN)
    public Response randomGenerator() {
        return Response
                .status(Response.Status.OK)
                .entity(String.valueOf(randomGenerator()))
                .build();
    }

    public int randomNumber() {
        Random rand = new Random();
        int upperbound = 101;
        // generate random values from 0-24
        int random = rand.nextInt(upperbound);
        return random;
    }
}
