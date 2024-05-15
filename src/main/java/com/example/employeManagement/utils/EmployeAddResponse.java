package com.example.employeManagement.utils;

import com.example.employeManagement.dtos.EmployeAddDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeAddResponse {
    private String status;
    private EmployeAddDTO employeAddDTO;
}
