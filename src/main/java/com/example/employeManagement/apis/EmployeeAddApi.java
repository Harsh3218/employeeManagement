package com.example.employeManagement.apis;

import com.example.employeManagement.dtos.EmployeAddDTO;
import com.example.employeManagement.service.EmployeService;
import com.example.employeManagement.utils.EmployeAddResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeAddApi {
    @Autowired
    private EmployeService empService;

    public EmployeAddResponse saveEmploye(EmployeAddDTO empAddDTO) {
        EmployeAddDTO employeAddDTO = empService.saveEmploye(empAddDTO);

        EmployeAddResponse response = new EmployeAddResponse();
        response.setStatus("Added");
        response.setEmployeAddDTO(employeAddDTO);
        return response;
    }
}
