package com.example.QLD.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.QLD.repository.GradeRepository;

import com.example.QLD.model.Award;
import com.example.QLD.model.Grade;
import com.example.QLD.model.StudentAccount;
import com.example.QLD.repository.StudentAccountRepository;

@Service
public class StudentAccountServiceImpl implements StudentAccountService {
    @Autowired
    private StudentAccountRepository studentAccountRepository; // kết nối tự động với kho

    @Autowired
    private AwardService awardService; // kết nối tự động với kho

    @Autowired
    private GradeService gradeService; // kết nối tự động với kho

    // Các phương thức được triển khai từ StudentAccountService
    @Override
    public StudentAccount save(StudentAccount entity) {
        return studentAccountRepository.save(entity);
    }

    @Override
    public List<StudentAccount> saveAll(List<StudentAccount> entities) {
        return (List<StudentAccount>) studentAccountRepository.saveAll(entities);
    }

    @Override
    public Optional<StudentAccount> findById(String id) {
        return studentAccountRepository.findById(id);
    }

    @Override
    public boolean existsById(String id) {
        return studentAccountRepository.existsById(id);
    }

    @Override
    public List<StudentAccount> findAll() {
        return (List<StudentAccount>) studentAccountRepository.findAll();
    }

    @Override
    public List<StudentAccount> findAllById(List<String> ids) {
        return (List<StudentAccount>) studentAccountRepository.findAllById(ids);
    }

    @Override
    public long count() {
        return studentAccountRepository.count();
    }

    @Override
    public void deleteById(String id) {
        studentAccountRepository.deleteById(id);
    }

    @Override
    public void delete(StudentAccount entity) {
        studentAccountRepository.delete(entity);
    }

    @Override
    public void deleteAllById(List<String> ids) {
        studentAccountRepository.deleteAllById(ids);
    }

    @Override
    public void deleteAll(List<StudentAccount> entities) {
        studentAccountRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        studentAccountRepository.deleteAll();
    }

    @Override
    public boolean checkLogin(String username, String password) {
        Optional<StudentAccount> optional = getStudentByUsername(username);
        if(optional.isPresent() && optional.get().getPassword().equals(password)){
            return true;
    }
    return false;
}


    @Override
public Optional<StudentAccount> getStudentByUsername(String username) {
    return studentAccountRepository.findByUsername(username);
}


}
