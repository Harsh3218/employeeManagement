package com.example.employeManagement.controller;

import com.example.employeManagement.apis.DepartmentAddApi;
import com.example.employeManagement.dtos.DepartmentAddDTO;
import com.example.employeManagement.entity.Department;
import com.example.employeManagement.utils.DepartmentAddResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentAddApi departmentAddApi;

    @PostMapping("/add")
    public DepartmentAddResponse add(@RequestBody DepartmentAddDTO departmentAddDTO) {
        return departmentAddApi.addDepartment(departmentAddDTO);
    }
}
