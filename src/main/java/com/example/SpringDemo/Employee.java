package com.example.SpringDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Employee {

    public Employee(Long empId, String empName, Long doj) {
        this.empId = empId;
        this.empName = empName;
        this.doj = doj;
    }

    public Employee(){}

    @Id
    @GeneratedValue
    private Long empId;
    private String empName;

    public Long getDoj() {
        return doj;
    }

    public void setDoj(Long doj) {
        this.doj = doj;
    }

    private Long doj;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }



}
