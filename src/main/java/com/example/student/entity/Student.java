
package com.example.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity
/*you told Spring Boot + JPA:

“This Student class should be mapped to a database table.” */
public class Student {

    @Id
    @GeneratedValue
    Long id;

    String name;
    String email;
    String course;
}
