package com.kotlin.demo.kotlin101.repository

import com.kotlin.demo.kotlin101.bean.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : JpaRepository<Employee,Int>{
}