package FrameworkBasedPrograming.controller;

import FrameworkBasedPrograming.model.Employees;
import FrameworkBasedPrograming.service.EmployeeSearchService;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping(value = {"/employees"})
class EmployeesControllerClass {

    @Autowired
    private EmployeeSearchService employeeSearchService;

    @RequestMapping(value="/all", method = RequestMethod.GET)
    public Collection<Employees> fetchAllEmployees() { return employeeSearchService.listEmployees(); }

    @RequestMapping(value = "/employeeId", method = RequestMethod.GET)
    public Employees getEmployeeById(
            @RequestParam(value = "employeeId") long id
    )
    {
        System.out.println(employeeSearchService.queryEmployeeById(id));
        return employeeSearchService.queryEmployeeById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public void addEmployee(
            @RequestBody(required = true) Employees employees)
    {
        employeeSearchService.addEmployee(employees);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void updateEmployee(
            @RequestBody(required = true) Employees employees)
    {
        employeeSearchService.updateEmployee(employees);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public  void deleteEmployee(
            @RequestParam(value = "employeeId", required = true) long id
    )
    {
        employeeSearchService.deleteEmployee(id);
    }

}
