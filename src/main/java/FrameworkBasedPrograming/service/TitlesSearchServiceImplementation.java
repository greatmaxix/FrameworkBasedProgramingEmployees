package FrameworkBasedPrograming.service;

import FrameworkBasedPrograming.dao.TitlesRepository;
import FrameworkBasedPrograming.model.Titles;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TitlesSearchServiceImplementation implements TitlesSearchService {
    private TitlesRepository titlesRepository;

    public TitlesSearchServiceImplementation(TitlesRepository titlesRepository){
        this.titlesRepository = titlesRepository;
    }

    @Override
    public void addTitle(Titles title) {
        titlesRepository.save(title);
    }

    @Override
    public void updateTitle(Titles title) {

    }

    @Override
    public void deleteSalary(long emp_no, String title) {

    }

    @Override
    public Collection<Titles> getTitlesByEmpNo(long emp_no) {
        return null;
    }

    @Override
    public Collection<Titles> getTitlesByTitleName(String titleName) {
        return null;
    }
}
