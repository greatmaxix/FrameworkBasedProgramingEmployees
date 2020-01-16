package FrameworkBasedPrograming.service;

import FrameworkBasedPrograming.dao.SalariesRepository;
import FrameworkBasedPrograming.model.Salaries;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Collection;

@Service
public class SalariesSearchServiceImplementation implements SalariesSearchService {
    private SalariesRepository salariesRepository;

    public SalariesSearchServiceImplementation(SalariesRepository salariesRepository){
        this.salariesRepository = salariesRepository;
    }

    @Override
    public void addSalary(Salaries salary) {
        salariesRepository.save(salary);
    }

    @Override
    public void updateSalary(Salaries salary) {
        Salaries temp_sal = salariesRepository.findByEmpNoAndFromDate(salary.getEmpNo(), salary.getFromDate());
        temp_sal.setEmpNo(salary.getEmpNo());
        temp_sal.setFromDate(salary.getFromDate());
        temp_sal.setToDate(salary.getToDate());
        temp_sal.setSalary(salary.getSalary());
        salariesRepository.save(temp_sal);
    }

    @Override
    public void deleteSalary(long emp_no, Timestamp from_date) {
        salariesRepository.deleteByEmpNoAndFromDate(emp_no, from_date);
    }

    @Override
    public Collection<Salaries> getAllSalariesByEmpNo(long emp_no) {
        return salariesRepository.findAllByEmpNo(emp_no);
    }

    @Override
    public Collection<Salaries> getAllSalariesBetweenDates(Timestamp from_date, Timestamp to_date) {
        return salariesRepository.findAllByFromDateAndToDate(from_date, to_date);
    }

    @Override
    public Collection<Salaries> getAllSalariesByEmpNoBetweenDates(long emp_no, Timestamp from_date, Timestamp to_date) {
        return salariesRepository.findAllByEmpNoAndFromDateAndToDate(emp_no, from_date, to_date);
    }
}
