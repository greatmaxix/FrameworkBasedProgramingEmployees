package FrameworkBasedPrograming.service;

import FrameworkBasedPrograming.model.Titles;

import java.util.Collection;

public interface TitlesSearchService {
    void addTitle(Titles title);
    void updateTitle(Titles title);
    void deleteSalary(long emp_no, String title);
    Collection<Titles> getTitlesByEmpNo(long emp_no);
    Collection<Titles> getTitlesByTitleName(String titleName);
}
