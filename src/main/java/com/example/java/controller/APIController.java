/*
 * 
 * 
 *
 * 
 * 
 *

 */

package com.example.java.controller;

    import com.example.java.model.Employees;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import com.example.java.service.APIService;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;


    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

@RestController
public class APIController {

    @Autowired
    public APIService service;

        @GetMapping("/helloWorld")
        public ResponseEntity<List<Employees>> getEmployees(@RequestParam(value="lastName", required=true) String lastName) {
            List<Employees> obj =  service.getEmployees(lastName);
             return new ResponseEntity(obj, HttpStatus.OK); 
        }



}