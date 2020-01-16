package FrameworkBasedPrograming.controller;

import FrameworkBasedPrograming.model.Salaries;
import FrameworkBasedPrograming.service.SalariesSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Collection;

@RestController
@RequestMapping(value = {"/salaries"})
public class SalariesControllerClass {
    @Autowired
    private SalariesSearchService salariesSearchService;

    @RequestMapping(value = "/empSalaries", method = RequestMethod.GET)
    public Collection<Salaries> getSalariesByEmpNo(
            @RequestParam(value = "empNo") long emp_no
    )
    {
        return salariesSearchService.getAllSalariesByEmpNo(emp_no);
    }

    @RequestMapping(value = "/salariesBetweenDates")
    public Collection<Salaries> getSalariesBetweenDates(
            @RequestParam(value = "fromDate")Timestamp from_date,
            @RequestParam(value = "toDate") Timestamp to_date
    )
    {
        return salariesSearchService.getAllSalariesBetweenDates(from_date, to_date);
    }

    @RequestMapping(value = "/salariesBetweenDatesOfEmployee")
    public Collection<Salaries> getSalariesBetweenDatesEmpNo(
            @RequestParam(value = "fromDate")Timestamp from_date,
            @RequestParam(value = "toDate") Timestamp to_date,
            @RequestParam(value = "empNo") long id
    )
    {
        return salariesSearchService.getAllSalariesByEmpNoBetweenDates(id, from_date, to_date);
    }


}
