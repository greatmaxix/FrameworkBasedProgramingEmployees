package FrameworkBasedPrograming.service;

import FrameworkBasedPrograming.dao.EmployeeRepository;
import FrameworkBasedPrograming.model.Employee;

import java.util.Collection;

public class EmployeeSearchServiceImplementation implements EmployeeSearchService {
    private EmployeeRepository employeeRepository;

    public EmployeeSearchServiceImplementation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Collection<Employee> listEmployees() {
        return (Collection<Employee>) employeeRepository.findAll();
    }
}
