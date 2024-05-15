package com.example.employeManagement.utils;

import com.example.employeManagement.dtos.DepartmentAddDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentAddResponse {
    private String status;
    private DepartmentAddDTO departmentAddDTO;
}
