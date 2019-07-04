package com.stackroute.controller;

import com.stackroute.domain.User;
import com.stackroute.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/")
public class ProducerController
{
    private ProducerService producerService;

    @Autowired
    ProducerController(ProducerService producerService)
    {
        this.producerService=producerService;
    }

    @PostMapping("producer/{stringMessage}")
    public ResponseEntity<String> sendMessage(@PathVariable String stringMessage)
    {
        ResponseEntity responseEntity;
        String status=producerService.sendString(stringMessage);
        responseEntity = new ResponseEntity<String>(status, HttpStatus.CREATED);
        return responseEntity;

    }
    @PostMapping("producerJsonObject")
    public ResponseEntity<?> sendJson(@RequestBody User user)
    {
        ResponseEntity responseEntity;
        System.out.println(user);
        String status=producerService.sendJsonObject(user);
        responseEntity = new ResponseEntity<String>(status, HttpStatus.CREATED);
        return responseEntity;

    }

}