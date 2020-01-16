package FrameworkBasedPrograming.service;

import FrameworkBasedPrograming.model.Salaries;

import java.sql.Timestamp;
import java.util.Collection;

public interface SalariesSearchService {
    void addSalary(Salaries salary);
    void updateSalary(Salaries salary);
    void deleteSalary(long emp_no, Timestamp from_date);
    Collection<Salaries> getAllSalariesByEmpNo(long emp_no);
    Collection<Salaries> getAllSalariesBetweenDates(Timestamp from_date, Timestamp to_date);
    Collection<Salaries> getAllSalariesByEmpNoBetweenDates(long emp_no, Timestamp from_date, Timestamp to_date);
}
