package com.codegym.demo23.service;

import com.codegym.demo23.model.LearningActivity;

import java.util.List;
import java.util.Optional;

public interface ActivityService {
    List<LearningActivity> findAll();
    Optional<LearningActivity> findById(Long id);
    void save(LearningActivity learningActivity);
    void remove(Long id);
}
