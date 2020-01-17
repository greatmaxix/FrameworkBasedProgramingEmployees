package FrameworkBasedPrograming.dao;

import FrameworkBasedPrograming.model.Salaries;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.Collection;

public interface SalariesRepository extends CrudRepository<Salaries, Long> {
    Collection<Salaries> findAllByEmpNo(long EmpNo);

    @Transactional
    void deleteByEmpNoAndFromDate(long EmpNo, Date from_date);

    Salaries findSalariesByEmpNoAndFromDate(long EmpNo, Date from_date);
    Collection<Salaries> findSalariesByFromDateGreaterThanEqualAndToDateLessThanEqual(Date from_date, Date to_date);
    Collection<Salaries> findSalariesByFromDateGreaterThanEqualAndToDateLessThanEqualAndEmpNo(Date from_date, Date to_date, long EmpNo);
    //Collection<Salaries> findAllByFromDateAndToDate(Date from_date, Date to_date);
    //Collection<Salaries> findAllByEmpNoAndFromDateAndToDate(long EmpNo, Date from_date, Date to_date);
}