package FrameworkBasedPrograming.service;

import FrameworkBasedPrograming.model.Departments;

import java.util.Collection;

public interface DepartmentSearchService {
    public Collection<Departments> listDepartments();

    public Departments queryDepartmentById(String id);

    void addDepartment(Departments departments);

    void updateDepartment(Departments departments);

    void deleteDepartment(String id);
}
