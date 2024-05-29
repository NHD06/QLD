package com.example.QLD.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.QLD.model.Award;

public interface AwardRepository extends JpaRepository<Award, String> {
    Optional<Award> findByStudentId(String studentId);

}
