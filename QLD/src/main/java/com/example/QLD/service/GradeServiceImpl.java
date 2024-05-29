package com.example.QLD.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QLD.model.Grade;
import com.example.QLD.repository.GradeRepository;

@Service
public class GradeServiceImpl implements GradeService{

    @Autowired
    private GradeRepository gradeRepository;
    @Override
    public Grade save(Grade entity) {
        return gradeRepository.save(entity);
    }

    @Override
    public List<Grade> saveAll(List<Grade> entities) {
        return (List<Grade>)gradeRepository.saveAll(entities);
    }

    @Override
    public Optional<Grade> findById(String id) {
        return gradeRepository.findById(id);
    }

    @Override
    public boolean existsById(String id) {
        return gradeRepository.existsById(id);
    }

    @Override
    public List<Grade> findAll() {
        return (List<Grade>)gradeRepository.findAll();
    }

    @Override
    public List<Grade> findAllById(List<String> ids) {
        return (List<Grade>)gradeRepository.findAllById(ids);
    }

    @Override
    public long count() {
        return gradeRepository.count();
    }

    @Override
    public void deleteById(String id) {
        gradeRepository.deleteById(id);
    }

    @Override
    public void delete(Grade entity) {
        gradeRepository.delete(entity);
    }

    @Override
    public void deleteAllById(List<String> ids) {
        gradeRepository.deleteAllById(ids);
    }

    @Override
    public void deleteAll(List<Grade> entities) {
        gradeRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        gradeRepository.deleteAll();
    }

    @Override
    public Optional<Grade> getGradeByStudentId(String studentId) {
        return gradeRepository.findByStudentId(studentId);
    }
}
