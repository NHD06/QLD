package com.example.QLD.service;

import java.util.List;
import java.util.Optional;

import com.example.QLD.model.Award;
import com.example.QLD.model.Award;

public interface AwardService {

    Award save(Award entity);

    List<Award> saveAll(List<Award> entities);

    Optional<Award> findById(String id);

    boolean existsById(String id);

    List<Award> findAll();

    List<Award> findAllById(List<String> ids);

    long count();

    void deleteById(String id);

    void delete(Award entity);

    void deleteAllById(List<String> ids);

    void deleteAll(List<Award> entities);

    void deleteAll();

}