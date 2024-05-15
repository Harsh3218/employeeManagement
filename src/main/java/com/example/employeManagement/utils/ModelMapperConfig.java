package com.example.employeManagement.utils;
import com.example.employeManagement.dtos.EmployeAddDTO;
import com.example.employeManagement.entity.Employe;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setSkipNullEnabled(true);
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        modelMapper.createTypeMap(Employe.class, EmployeAddDTO.class)
                .addMapping(src -> src.getDepartment().getName(), EmployeAddDTO::setDepartmentName);
        return modelMapper;
    }
}
