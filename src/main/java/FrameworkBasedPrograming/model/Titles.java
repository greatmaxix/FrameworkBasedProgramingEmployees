package FrameworkBasedPrograming.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Titles {
    @Id
    @Column(name="emp_no", nullable = false)
    private Long empNo;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="from_date", nullable = false)
    private Timestamp fromDate;

    @Column(name="to_date", nullable = false)
    private Timestamp toDate;

    public Titles() {

    }

    public Long getEmp_no() {
        return empNo;
    }

    public void setEmp_no(Long emp_no) {
        this.empNo = emp_no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getFrom_date() {
        return fromDate;
    }

    public void setFrom_date(Timestamp from_date) {
        this.fromDate = from_date;
    }

    public Timestamp getTo_date() {
        return toDate;
    }

    public void setTo_date(Timestamp to_date) {
        this.toDate = to_date;
    }

    @Override
    public String toString() {
        return "Titles{" +
                "emp_no=" + empNo +
                ", title='" + title + '\'' +
                ", from_date=" + fromDate +
                ", to_date=" + toDate +
                '}';
    }
}