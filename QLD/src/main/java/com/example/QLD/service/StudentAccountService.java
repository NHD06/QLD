package com.example.QLD.service;

import java.util.List;
import java.util.Optional;

import com.example.QLD.model.Award;
import com.example.QLD.model.Grade;
import com.example.QLD.model.StudentAccount;

public interface StudentAccountService {

    StudentAccount save(StudentAccount entity);

    List<StudentAccount> saveAll(List<StudentAccount> entities);

    Optional<StudentAccount> findById(String id);

    boolean existsById(String id);

    List<StudentAccount> findAll();

    List<StudentAccount> findAllById(List<String> ids);

    long count();

    void deleteById(String id);

    void delete(StudentAccount entity);

    void deleteAllById(List<String> ids);

    void deleteAll(List<StudentAccount> entities);

    void deleteAll();

    boolean checkLogin(String username, String password);

    Optional<StudentAccount> getStudentByUsername(String username);
}
