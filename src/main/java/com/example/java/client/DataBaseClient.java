/*
 * 
 * 
 *
 * 
 * 
 *

 */

package com.example.java.client;

    import com.example.java.model.Employees;

import org.springframework.stereotype.*;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface DataBaseClient extends JpaRepository<Employees, Long>{

    @Query(value = "select id, first_name, last_name, age, city from employees where last_name = :lastName", nativeQuery=true)
    public  List<Employees> findByLastName(String lastName);
}
