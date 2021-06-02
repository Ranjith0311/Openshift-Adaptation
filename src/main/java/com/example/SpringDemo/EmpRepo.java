package com.example.SpringDemo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmpRepo extends CrudRepository<Employee,Long> {

    @Query("select e from Employee e order by e.empId desc")
    List<Employee> findAllByIdAsc();
}
