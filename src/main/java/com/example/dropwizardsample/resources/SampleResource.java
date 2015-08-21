package com.example.dropwizardsample.resources;

import com.codahale.metrics.annotation.Timed;
import com.example.dropwizardsample.SampleEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class SampleResource {

    public SampleResource() {
    }

    @GET
    @Timed
    public SampleEntity welcomeMessage() {
        return new SampleEntity("Hello world!");
    }
}