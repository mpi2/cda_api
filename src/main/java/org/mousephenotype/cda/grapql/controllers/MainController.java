package org.mousephenotype.cda.grapql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class MainController {


    @Autowired
    MainController() throws IOException {
    }

    @PostMapping(value = "/query")
    public ResponseEntity query(@RequestBody String query){
        return ResponseEntity.ok("test");
    }

}
