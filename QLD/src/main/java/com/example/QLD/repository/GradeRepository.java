package com.example.QLD.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.QLD.model.Grade;

public interface GradeRepository extends JpaRepository<Grade, String> {
    Optional<Grade> findByStudentId(String studentId);
}

