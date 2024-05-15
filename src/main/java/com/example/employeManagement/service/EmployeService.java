package com.example.employeManagement.service;

import com.example.employeManagement.dtos.EmployeAddDTO;
import com.example.employeManagement.entity.Department;
import com.example.employeManagement.entity.Employe;
import com.example.employeManagement.exception.NotFoundException;
import com.example.employeManagement.repository.DepartmentRepository;
import com.example.employeManagement.repository.EmployeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class EmployeService {
    @Autowired
    private EmployeRepository employeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private ModelMapper modelMapper;

    public EmployeAddDTO saveEmploye(EmployeAddDTO employeAddDTO){
        String departmentName = employeAddDTO.getDepartmentName();
        Optional<Department> department = departmentRepository.findByNameIgnoreCase(departmentName);
        if(department.isPresent()){
            Employe employe = convertToEntity(employeAddDTO);
            employe.setDepartment(department.get());
            Employe savedEmployee = employeRepository.save(employe);
            return convertToDto(savedEmployee);
        } else {
            throw new NotFoundException("Department with name " + departmentName + " not found");
        }
    }

    private EmployeAddDTO convertToDto(Employe employe){
        EmployeAddDTO employeAddDTO = modelMapper.map(employe, EmployeAddDTO.class);
        return employeAddDTO;
    }

    private Employe convertToEntity(EmployeAddDTO employeAddDTO) {
        return modelMapper.map(employeAddDTO, Employe.class);
    }
}
