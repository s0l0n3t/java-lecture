package com.furkantokgoz.ui.rest;

import com.furkantokgoz.business.dto.EmployeeDto;
import com.furkantokgoz.business.services.EmployeeService;
import com.furkantokgoz.data.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {


    EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeEntity employeeEntity) {
        this.employeeService = employeeService;
    }


    // localhost:8080/api/v1/employees
    @GetMapping("/employees")
    public List<EmployeeDto> getAllEmployees(){
        List<EmployeeDto> employeeDtoList = employeeService.getAllEmployees();
        return employeeDtoList;
    }
    // localhost:8080/api/v1/find/1
    @GetMapping("/find/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id){
        List<EmployeeDto> employeeDtoList = employeeService.getAllEmployees();
        return ResponseEntity.ok(employeeDtoList.get(0));
    }

    @PostMapping("/employees")
    public EmployeeDto createEmployee(@RequestBody EmployeeDto employeeDto){
        employeeService.createEmployee(employeeDto);
        return employeeDto;
    }

    //UPDATE
    @PutMapping("/employees/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable Long id, @RequestBody EmployeeDto employeeDto) throws Throwable {
        employeeService.updateEmployee(id,employeeDto);
        return ResponseEntity.ok(employeeDto);
    }

    //DELETE
    @DeleteMapping("employees/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable Long id) throws Throwable {
        employeeService.deleteEmployee(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }


}
