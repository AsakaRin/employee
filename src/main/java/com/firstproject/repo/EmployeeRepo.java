package com.firstproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.firstproject.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    Optional<Employee> findEmployeeById(Long id);

    void deleteEmployeeById(Long id);

}
