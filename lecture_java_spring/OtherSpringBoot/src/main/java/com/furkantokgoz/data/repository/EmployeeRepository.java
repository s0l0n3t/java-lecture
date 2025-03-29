package com.furkantokgoz.data.repository;


import com.furkantokgoz.business.dto.EmployeeDto;
import com.furkantokgoz.data.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

}
