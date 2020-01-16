package FrameworkBasedPrograming.dao;

import FrameworkBasedPrograming.model.Titles;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface TitlesRepository extends CrudRepository<Titles, Long> {
    Collection<Titles> findAllByEmpNo(long emp_no);
    Collection<Titles> findAllByTitle(String title);
    void deleteByEmpNoAndFromDate(long emp_no, String title);
}
