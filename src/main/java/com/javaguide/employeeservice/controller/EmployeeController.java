package com.javaguide.employeeservice.controller;

import com.javaguide.employeeservice.constansts.EmployeeUrlPathConstants;
import com.javaguide.employeeservice.dto.EmployeeDto;
import com.javaguide.employeeservice.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(EmployeeUrlPathConstants.EMPLOYEE)
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Void> createEmployee(@RequestBody @Valid EmployeeDto employeeDto){
        employeeService.saveEmployee(employeeDto);
        return ResponseEntity.ok().build();

    }





}
