package FrameworkBasedPrograming.service;

import FrameworkBasedPrograming.model.Employees;
import com.sun.xml.bind.v2.model.core.ID;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Optional;

public interface EmployeeSearchService {
    public Collection<Employees> listEmployees();
    public Employees queryEmployeeById(long id);
    void addEmployee(Employees employees);

    void updateEmployee(Employees employees);

    void deleteEmployee(long id);

    public Collection<Employees> listEmployeesByFirstName(String first_name);

    public Collection<Employees> listEmployeesByLastName(String last_name);

    public Collection<Employees> listEmployeesByFullName(String first_name, String last_name);

    public Collection<Employees> listEmployeesByHireDate(Timestamp hire_date);

}
