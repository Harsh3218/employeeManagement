package com.example.employeManagement.apis;

import com.example.employeManagement.dtos.DepartmentAddDTO;
import com.example.employeManagement.entity.Department;
import com.example.employeManagement.repository.DepartmentRepository;
import com.example.employeManagement.service.DepartmentService;
import com.example.employeManagement.utils.DepartmentAddResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DepartmentAddApi {
    @Autowired
    private DepartmentService departmentService;

    public DepartmentAddResponse addDepartment(DepartmentAddDTO departmentAddDTO) {
        DepartmentAddDTO department = departmentService.saveDepartment(departmentAddDTO);

        DepartmentAddResponse departmentAddResponse = new DepartmentAddResponse();
        departmentAddResponse.setStatus("Added");
        departmentAddResponse.setDepartmentAddDTO(department);
        return departmentAddResponse;

    }
}
