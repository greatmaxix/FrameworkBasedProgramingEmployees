package FrameworkBasedPrograming.dao;

import FrameworkBasedPrograming.model.Titles;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.Collection;

public interface TitlesRepository extends CrudRepository<Titles, Long> {
    Collection<Titles> findAllByEmpNo(long emp_no);
    Titles findByEmpNoAndFromDate(long emp_no, Date from_date);
    Collection<Titles> findAllByTitle(String title);
    void deleteByEmpNoAndFromDate(long emp_no, Date from_date);
}
