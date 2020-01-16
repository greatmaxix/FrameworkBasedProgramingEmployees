package FrameworkBasedPrograming.dao;

import FrameworkBasedPrograming.model.Salaries;
import org.springframework.data.repository.CrudRepository;

import java.sql.Timestamp;
import java.util.Collection;

public interface SalariesRepository extends CrudRepository<Salaries, Long> {
    Collection<Salaries> findAllByEmpNo(long EmpNo);
    void deleteByEmpNoAndFromDate(long EmpNo, Timestamp from_date);
    Salaries findByEmpNoAndFromDate(long EmpNo, Timestamp from_date);
    Collection<Salaries> findAllByFromDateAndToDate(Timestamp from_date, Timestamp to_date);
    Collection<Salaries> findAllByEmpNoAndFromDateAndToDate(long EmpNo, Timestamp from_date, Timestamp to_date);
}