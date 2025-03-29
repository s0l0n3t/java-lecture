package com.furkantokgoz.business.services;

import com.furkantokgoz.business.dto.EmployeeDto;
import com.furkantokgoz.data.entity.EmployeeEntity;
import com.furkantokgoz.data.repository.EmployeeRepository;
import com.furkantokgoz.exception.ResourceNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Service
@RequestMapping("/api/")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ModelMapper modelMapper;

    //http://localhost:8080/api

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<EmployeeDto> listDto = new ArrayList<>();
        Iterable<EmployeeEntity> entities = employeeRepository.findAll();
        for(EmployeeEntity entity: entities) {
            EmployeeDto employeeDto = entityDto(entity);
            listDto.add(employeeDto);
        }
        return listDto;
    }


    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity = dtoEntity(employeeDto);
        employeeRepository.save(employeeEntity);
        return employeeDto;
    }

    //http://localhost:8080/api/employees/1

    @Override
    public ResponseEntity<EmployeeDto> getEmployeeById(Long id){
        EmployeeEntity employeeEntity = (EmployeeEntity) employeeRepository.findAllById(Collections.singleton(id));
        EmployeeDto employeeDto = entityDto(employeeEntity);
        return ResponseEntity.ok(employeeDto);
    }

    @Override
    public ResponseEntity<EmployeeDto> updateEmployee(Long id, EmployeeDto employeeDto) throws Throwable {
        EmployeeEntity employeeEntity = dtoEntity(employeeDto);
        EmployeeEntity employeeBody = (EmployeeEntity) employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee not exist id: "+ id));
        employeeBody.setFirstName(employeeEntity.getFirstName());
        employeeBody.setLastName(employeeEntity.getLastName());
        employeeBody.setAge(employeeEntity.getAge());
        EmployeeDto updatedEmployeeDto = entityDto((EmployeeEntity) employeeRepository.save(employeeBody));
        EmployeeEntity employeeEntity1 = dtoEntity(updatedEmployeeDto);
        return ResponseEntity.ok(updatedEmployeeDto);
    }


    @Override
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(Long id) throws Throwable {
        EmployeeEntity employeeEntity = (EmployeeEntity) employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee not exist id: "+ id));
        employeeRepository.delete(employeeEntity);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

/// ///////
    //Model mapper
    // Entity -> DTO
    @Override
    public EmployeeDto entityDto(EmployeeEntity employeeEntity) {
        EmployeeDto employeeDto = modelMapper.map(employeeEntity, EmployeeDto.class);
        return null;
    }
    //DTO -> Entity
    @Override
    public EmployeeEntity dtoEntity(EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity = modelMapper.map(employeeDto, EmployeeEntity.class);
        return null;
    }
}
