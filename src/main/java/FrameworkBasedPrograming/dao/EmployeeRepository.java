package FrameworkBasedPrograming.dao;

import FrameworkBasedPrograming.model.Employees;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.Collection;

public interface EmployeeRepository extends CrudRepository<Employees, Long> {
    //Optional<Employees> findByEmp_no(long id);
    Employees findByEmpNo(long emp_no);

    @Transactional
    void deleteByEmpNo(long emp_no);

    Collection<Employees> findAllByFirstName(String first_name);

    Collection<Employees> findAllByLastName(String last_name);

    Collection<Employees> findAllByFirstNameAndLastName(String first_name, String last_name);

    Collection<Employees> findAllByHireDate(Timestamp hire_date);

}
