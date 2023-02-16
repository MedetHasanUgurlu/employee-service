package com.javaguide.employeeservice.service.imp;

import com.javaguide.employeeservice.dto.EmployeeDto;
import com.javaguide.employeeservice.entity.Employee;
import com.javaguide.employeeservice.exceptions.ResourceNotFoundException;
import com.javaguide.employeeservice.repository.EmployeeRepository;
import com.javaguide.employeeservice.service.EmployeeService;
import com.javaguide.employeeservice.util.ModelMapperBean;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImp implements EmployeeService {
    private final EmployeeRepository repository;

    private final ModelMapperBean modelMapperBean;


    public EmployeeDto entityToDto(Employee employee){
        return  modelMapperBean.getModelMapper().map(employee,EmployeeDto.class);
    }
    public Employee dtoToEntity(EmployeeDto employeeDto){
        return modelMapperBean.getModelMapper().map(employeeDto,Employee.class);
    }
    public void saveEmployee(EmployeeDto employeeDto){
        repository.save(dtoToEntity(employeeDto));
    }
    public EmployeeDto getEmployeeById(Long id){
        return entityToDto(repository.findById(id).orElseThrow(()->new ResourceNotFoundException("A","B",id)));
    }


}
