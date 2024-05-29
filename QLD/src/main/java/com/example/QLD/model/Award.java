package com.example.QLD.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "awards")
public class Award {
    @Id
    @Column(name = "student_id", length = 50)
    private String studentId;

    @Column(name = "type", length = 50, nullable = false)
    private String type;

    @Column(name = "description", length = 255, nullable = false)
    private String description;

    @Column(name = "date", nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "student_id", insertable = false, updatable = false)
    private StudentAccount studentAccount;

    public Award() {
    }

    public Award(String studentId, String type, String description, Date date, StudentAccount studentAccount) {
        this.studentId = studentId;
        this.type = type;
        this.description = description;
        this.date = date;
        this.studentAccount = studentAccount;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public StudentAccount getStudentAccount() {
        return studentAccount;
    }

    public void setStudentAccount(StudentAccount studentAccount) {
        this.studentAccount = studentAccount;
    }

    
    // Getters and Setters
    
}