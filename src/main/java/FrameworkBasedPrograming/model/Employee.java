package FrameworkBasedPrograming.model;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "actor_id", nullable = false)
    private Long id;

    @Column(name="first_name", nullable = false)
    private String first_name;

    @Column(name="last_name", nullable = false)
    private String last_name;

    @Column(name="birth_date", nullable = false)
    private Timestamp birth_date;

    @Column(name="hire_date", nullable = false)
    private Timestamp hire_date;

    @Column(name="gender", nullable = false)
    private char gender;

    public Employee(String first_name, String last_name, Timestamp birth_date, Timestamp hire_date, char gender) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.hire_date = hire_date;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Timestamp getBirth_date() {
        return birth_date;
    }

    public Timestamp getHire_date() {
        return hire_date;
    }

    public char getGender() {
        return gender;
    }
}
