package com.example.employeManagement.dtos;

import com.example.employeManagement.entity.Department;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeAddDTO {
    private String name;
    private String departmentName;
    private String jobTitle;
    private double salary;
}
