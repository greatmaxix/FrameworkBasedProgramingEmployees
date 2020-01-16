package FrameworkBasedPrograming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Dept_manager {
    @Id
    @Column(name="emp_no", nullable = false)
    private Long empNo;

    @Column(name="dept_no", nullable = false)
    private char dept_no;

    @Column(name="from_date", nullable = false)
    private Timestamp fromDate;

    @Column(name="to_date", nullable = false)
    private Timestamp toDate;

    public Dept_manager() {
    }

    @Override
    public String toString() {
        return "Dept_manager{" +
                "empNo=" + empNo +
                ", dept_no=" + dept_no +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                '}';
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
}
