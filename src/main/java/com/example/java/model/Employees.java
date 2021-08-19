/*
 * 
 * 
 *
 * 
 * 
 *

 */


package com.example.java.model;

    import java.util.Objects;
    import java.util.Arrays;
    import javax.persistence.*;

/**
* Employees
*/


@Entity
public class Employees {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

        private String first_name;


        private String last_name;


        private Integer age;


        private String city;



    /**
        * Get first_name
    * @return first_name
    **/
    
    public String getFirstName() {
    return first_name;
    }

        public void setFirstName(String first_name) {
        this.first_name = first_name;
        }



    /**
        * Get last_name
    * @return last_name
    **/
    
    public String getLastName() {
    return last_name;
    }

        public void setLastName(String last_name) {
        this.last_name = last_name;
        }



    /**
        * Get age
    * @return age
    **/
    
    public Integer getAge() {
    return age;
    }

        public void setAge(Integer age) {
        this.age = age;
        }



    /**
        * Get city
    * @return city
    **/
    
    public String getCity() {
    return city;
    }

        public void setCity(String city) {
        this.city = city;
        }


}

