package com.example.employeManagement.repository;

import com.example.employeManagement.entity.Attendence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendence,Long> {
}
