package com.example.QLD.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.QLD.model.StudentAccount;

public interface StudentAccountRepository extends JpaRepository<StudentAccount, String> {
    Optional<StudentAccount> findByUsername(String username);

}
