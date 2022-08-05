package com.kotlin.demo.kotlin101.service

import com.kotlin.demo.kotlin101.bean.Employee
import com.kotlin.demo.kotlin101.repository.EmployeeRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class EmployeeService(var employeeRepository: EmployeeRepository) {

    fun getEmployeeById(id: Int): Employee? = employeeRepository.findByIdOrNull(id)

    fun saveEmployee(employee: Employee): Employee = employeeRepository.save(employee)

    fun getEmployee(): List<Employee> = employeeRepository.findAll()

    fun deleteEmployee(id: Int): Unit = employeeRepository.deleteById(id)

    fun updateEmployee(employee: Employee): Employee = employeeRepository.save(employee)

    fun getEmployeesOfSize(start: Int): Page<Employee> = employeeRepository.findAll(PageRequest.of(start,10))

    fun saveBulkEmployee(employees: List<Employee>): MutableList<Employee> = employeeRepository.saveAll(employees)


}