package com.srijeet.employee_server.repository;

import com.srijeet.employee_server.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
