package FrameworkBasedPrograming.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Salaries {
    @Id
    @Column(name="emp_no", nullable = false)
    private long empNo;

    @Column(name="salary", nullable = false)
    private long salary;

    @Column(name="from_date", nullable = false)
    private Timestamp fromDate;

    @Column(name="to_date", nullable = false)
    private Timestamp toDate;

    public long getEmpNo() {
        return empNo;
    }

    public void setEmpNo(long empNo) {
        this.empNo = empNo;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Timestamp getFromDate() {
        return fromDate;
    }

    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }

    public Timestamp getToDate() {
        return toDate;
    }

    public void setToDate(Timestamp toDate) {
        this.toDate = toDate;
    }

    public Salaries() {

    }

    @Override
    public String toString() {
        return "Salaries{" +
                "empNo=" + empNo +
                ", salary='" + salary + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                '}';
    }
}
