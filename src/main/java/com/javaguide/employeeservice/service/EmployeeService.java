package com.javaguide.employeeservice.service;

import com.javaguide.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto getEmployeeById(Long id);
    void saveEmployee(EmployeeDto employeeDto);
}
