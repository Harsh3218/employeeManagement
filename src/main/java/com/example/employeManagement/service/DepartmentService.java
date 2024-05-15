package com.example.employeManagement.service;

import com.example.employeManagement.dtos.DepartmentAddDTO;
import com.example.employeManagement.entity.Department;
import com.example.employeManagement.repository.DepartmentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private ModelMapper modelMapper;

    public DepartmentAddDTO saveDepartment(DepartmentAddDTO departmentAddDTO) {
        Department department = modelMapper.map(departmentAddDTO, Department.class);
        Department savedDepartment = departmentRepository.save(department);
        return modelMapper.map(savedDepartment, DepartmentAddDTO.class);
    }
}
