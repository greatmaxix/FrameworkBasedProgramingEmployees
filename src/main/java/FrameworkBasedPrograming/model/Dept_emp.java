package FrameworkBasedPrograming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Dept_emp {
    @Id
    @Column(name="emp_no", nullable = false)
    private Long empNo;

    @Column(name="dept_no", nullable = false)
    private char dept_no;

    @Column(name="from_date", nullable = false)
    private Date fromDate;

    @Column(name="to_date", nullable = false)
    private Date toDate;

    public Dept_emp() {
    }

    public Dept_emp(Long empNo, char dept_no, Date fromDate, Date toDate) {
        this.empNo = empNo;
        this.dept_no = dept_no;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Long getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Long empNo) {
        this.empNo = empNo;
    }

    public char getDept_no() {
        return dept_no;
    }

    public void setDept_no(char dept_no) {
        this.dept_no = dept_no;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return "Dept_emp{" +
                "empNo=" + empNo +
                ", dept_no=" + dept_no +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                '}';
    }
}
