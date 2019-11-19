package FrameworkBasedPrograming.controller;

import FrameworkBasedPrograming.model.Employee;
import FrameworkBasedPrograming.service.EmployeeSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(value = {"/employees"})
public class EmployeesControllerClass {

    @Autowired
    private EmployeeSearchService employeeSearchService;

    @RequestMapping(value="all", method = RequestMethod.GET)
    public Collection<Employee> fetchAllEmployees() { return employeeSearchService.listEmployees(); }
}
