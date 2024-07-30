package com.vivek.enttiy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "employee_details")
public class Employee {

   @Id
    private Integer id;
    private String name;
    private Double sal;
}
