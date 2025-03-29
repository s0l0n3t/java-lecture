package com.furkantokgoz.business.services;


import com.furkantokgoz.business.dto.EmployeeDto;
import com.furkantokgoz.data.entity.EmployeeEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    public List<EmployeeDto> getAllEmployees();
    public EmployeeDto createEmployee(EmployeeDto employeeDto);
    public ResponseEntity<EmployeeDto> getEmployeeById(Long id);
    public ResponseEntity<EmployeeDto> updateEmployee(Long id, EmployeeDto employeeDto) throws Throwable;
    public ResponseEntity<Map<String,Boolean>> deleteEmployee(Long id) throws Throwable;

    //Model mapper
    public EmployeeDto entityDto(EmployeeEntity employeeEntity);
    public EmployeeEntity dtoEntity(EmployeeDto employeeDto);
}
