package com.example.demospringrestjersey.service;

import com.example.demospringrestjersey.models.Bootcamper;
import org.jvnet.hk2.annotations.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Los servicios son la parte logica de nuestras aplicacion REST
 */
@Service
public class BootcamperService {

    private List<Bootcamper> bootcampers = new ArrayList<>();

    public List<Bootcamper> getAll(){
        return  bootcampers;
    }

    public void add(Bootcamper bootcamper){
        bootcampers.add(bootcamper);
    }

}
