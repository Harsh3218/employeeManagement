package com.example.employeManagement.controller;

import com.example.employeManagement.apis.EmployeeAddApi;
import com.example.employeManagement.dtos.EmployeAddDTO;
import com.example.employeManagement.service.EmployeService;
import com.example.employeManagement.utils.EmployeAddResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeController {
    @Autowired
    private EmployeeAddApi employeeAddApi;

    @PostMapping("/add")
    public EmployeAddResponse saveEmploye(@RequestBody EmployeAddDTO employeAddDTO) {
        return employeeAddApi.saveEmploye(employeAddDTO);
    }
}
