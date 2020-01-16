package FrameworkBasedPrograming.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

enum Gender {
    M,
    F
}

@Entity
//@Table( name="employees" )
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_no", nullable = false)
    private Long empNo;

    @Column(name="first_name", nullable = false)
    private String firstName;

    @Column(name="last_name", nullable = false)
    private String lastName;

    @Column(name="birth_date", nullable = false)
    private Timestamp birthDate;

    @Column(name="hire_date", nullable = false)
    private Timestamp hireDate;

    @Column(name="gender", nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Collection<Titles> getTitles() {
        return titles;
    }

    public Collection<Salaries> getSalaries() {
        return salaries;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "empNo=" + empNo +
                ", first_name='" + firstName + '\'' +
                ", last_name='" + lastName + '\'' +
                ", birth_date=" + birthDate +
                ", hire_date=" + hireDate +
                ", gender=" + gender +
                ", titles=" + titles +
                ", salaries=" + salaries +
                '}';
    }

    public void setTitles(Collection<Titles> titles) {
        this.titles = titles;
    }

    public void setSalaries(Collection<Salaries> salaries) {
        this.salaries = salaries;
    }

    @OneToMany(
        orphanRemoval = true
    )
    @JoinColumn(name = "emp_no")
    private Collection<Titles> titles;

    @OneToMany(
        orphanRemoval = true
    )
    @JoinColumn(name = "emp_no")
    private Collection<Salaries> salaries;

    public Employees() {
    }

    public String getFirst_name() {
        return firstName;
    }

    public String getLast_name() {
        return lastName;
    }

    public Timestamp getBirth_date() {
        return birthDate;
    }

    public Timestamp getHire_date() {
        return hireDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setEmpNo(Long empNo) {
        this.empNo = empNo;
    }

    public Long getEmpNo() {
        return empNo;
    }

    public void setFirst_name(String first_name) {
        this.firstName = first_name;
    }

    public void setLast_name(String last_name) {
        this.lastName = last_name;
    }

    public void setBirth_date(Timestamp birth_date) {
        this.birthDate = birth_date;
    }

    public void setHire_date(Timestamp hire_date) {
        this.hireDate = hire_date;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
