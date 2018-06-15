package com.sprint.com.sprint.service;

import com.sprint.com.sprint.GsmaRepository;
import com.sprint.com.sprint.model.Tac;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by luxmanseshadri on 6/15/18.
 */
@RestController
public class GsmaServiceController {

    Logger logger = Logger.getLogger(GsmaServiceController.class.getName());
    @Autowired
    private GsmaRepository repository;


    @GetMapping(value = "/tacs", produces = "application/json")
    public Iterable<Tac> retrieveTacs(){
        logger.info("retrieve tacs <filler>");
        return repository.findAll();
    }
    @GetMapping(value = "/tacs/{id}",produces = "application/json")
    public Tac getTac(@PathVariable String id){
        		return this.repository.findById(id).orElse(null);

    }

}
