package com.example.employeManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String departmentName;
    @ManyToOne
    @JoinColumn(name = "dep_id")
    private Department department;

    private String jobTitle;
    private double   salary;

}
