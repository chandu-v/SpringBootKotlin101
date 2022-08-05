package com.kotlin.demo.kotlin101.controller

import com.kotlin.demo.kotlin101.bean.Employee
import com.kotlin.demo.kotlin101.service.EmployeeService
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.*

@RestController
class EmployeeController(var employeeService: EmployeeService) {

    @GetMapping(value = ["/test/test"])
    fun test() = "Working"

    @GetMapping(value = ["/{employeeId}"])
    fun getEmployeeById(@PathVariable employeeId: Int): Employee? = employeeService.getEmployeeById(employeeId)

    @PostMapping(value = [""])
    fun saveEmployee(@RequestBody employee: Employee): Employee = employeeService.saveEmployee(employee)

    @PostMapping(value = ["/bulk"])
    fun saveBulkEmployee(@RequestBody employees: List<Employee>): MutableList<Employee> = employeeService.saveBulkEmployee(employees)

    @PutMapping(value = [""])
    fun updateEmployee(@RequestBody employee: Employee): Employee = employeeService.updateEmployee(employee)

    @DeleteMapping(value = ["/{id}"])
    fun deleteEmployeeById(@PathVariable id: Int): Unit = employeeService.deleteEmployee(id)

    @GetMapping(value = ["/all"])
    fun getAllEmployees(): List<Employee> = employeeService.getEmployee();

    @GetMapping(value = ["/page/{pageNumber}"])
    fun getAllEmployeesByPage(@PathVariable pageNumber: Int): Page<Employee> = employeeService.getEmployeesOfSize(pageNumber);
}