package com.vivek.Controller;

import com.vivek.Service.EmployeeService;
import com.vivek.enttiy.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;


    @PostMapping("/create")
    ResponseEntity<String>saveEmplpyeedData(@RequestBody Employee emp){
        service.saveEmp(emp);
        return new ResponseEntity<>("DataSaved", HttpStatus.CREATED);

    }
}
