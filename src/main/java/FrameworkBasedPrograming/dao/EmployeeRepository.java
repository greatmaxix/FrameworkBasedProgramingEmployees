package FrameworkBasedPrograming.dao;

import FrameworkBasedPrograming.model.Employees;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface EmployeeRepository extends CrudRepository<Employees, Long> {
    //Optional<Employees> findByEmp_no(long id);
    Employees findByEmpNo(long emp_no);

    @Transactional
    void deleteByEmpNo(long emp_no);
}
