package com.example.demospringrestjersey.controllers;

import com.example.demospringrestjersey.models.Bootcamper;
import com.example.demospringrestjersey.service.BootcamperService;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Component
@Path("/")
public class BootCampersController {

    private BootcamperService bootcamperService;


    public BootCampersController(BootcamperService bootcamperService){
        this.bootcamperService = bootcamperService;
    }

    @GET
    @Path("/bootcampers")
    @Produces("text/plain")
    public List<Bootcamper> listarTodos(){
        return bootcamperService.getAll();
    }

}
