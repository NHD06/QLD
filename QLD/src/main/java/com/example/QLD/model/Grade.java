package com.example.QLD.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "grades")
public class Grade {
    @Id
    @Column(name = "student_id", length = 50)
    private String studentId;

    @Column(name = "course1")
    private Double course1;

    @Column(name = "course2")
    private Double course2;

    @Column(name = "course3")
    private Double course3;

    @Column(name = "course4")
    private Double course4;

    @Column(name = "course5")
    private Double course5;

    @Column(name = "course6")
    private Double course6;

    @Column(name = "average")
    private Double average;

    @ManyToOne
    private StudentAccount studentAccount;
    // Getters and Setters

    public StudentAccount getStudentAccount() {
        return studentAccount;
    }

    public void setStudentAccount(StudentAccount studentAccount) {
        this.studentAccount = studentAccount;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Double getCourse1() {
        return course1;
    }

    public void setCourse1(Double course1) {
        this.course1 = course1;
        updateAverage();
    }

    public Double getCourse2() {
        return course2;
    }

    public void setCourse2(Double course2) {
        this.course2 = course2;
        updateAverage();
    }

    public Double getCourse3() {
        return course3;
    }

    public void setCourse3(Double course3) {
        this.course3 = course3;
        updateAverage();
    }

    public Double getCourse4() {
        return course4;
    }

    public void setCourse4(Double course4) {
        this.course4 = course4;
        updateAverage();
    }

    public Double getCourse5() {
        return course5;
    }

    public void setCourse5(Double course5) {
        this.course5 = course5;
        updateAverage();
    }

    public Double getCourse6() {
        return course6;
    }

    public void setCourse6(Double course6) {
        this.course6 = course6;
        updateAverage();
    }

    public Double getAverage() {
        return average;
    }

    private void updateAverage() {
        double total = 0;
        int count = 0;

        if (course1 != null) {
            total += course1;
            count++;
        }
        if (course2 != null) {
            total += course2;
            count++;
        }
        if (course3 != null) {
            total += course3;
            count++;
        }
        if (course4 != null) {
            total += course4;
            count++;
        }
        if (course5 != null) {
            total += course5;
            count++;
        }
        if (course6 != null) {
            total += course6;
            count++;
        }

        this.average = count > 0 ? total / count : null;
    }
}


