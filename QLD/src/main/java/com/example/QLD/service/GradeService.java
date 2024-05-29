package com.example.QLD.service;

import java.util.List;
import java.util.Optional;

import com.example.QLD.model.Grade;

public interface GradeService {

    Grade save(Grade entity);

    List<Grade> saveAll(List<Grade> entities);

    Optional<Grade> findById(String id);

    boolean existsById(String id);

    List<Grade> findAll();

    List<Grade> findAllById(List<String> ids);

    long count();

    void deleteById(String id);

    void delete(Grade entity);

    void deleteAllById(List<String> ids);

    void deleteAll(List<Grade> entities);

    void deleteAll();

    Optional<Grade> getGradeByStudentId(String studentId);
}