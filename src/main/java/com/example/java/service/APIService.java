/*
 * 
 * 
 *
 * 
 * 
 *

 */

package com.example.java.service;

    import com.example.java.model.Employees;


import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
    import com.example.java.client.DataBaseClient;
    import org.springframework.transaction.annotation.Transactional;
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;


@Service
@Transactional
public class APIService {


    @Autowired
    public DataBaseClient client;
    public  List<Employees> getEmployees(String lastName) {
        return client.findByLastName(lastName);
    }

}