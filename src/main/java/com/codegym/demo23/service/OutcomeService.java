package com.codegym.demo23.service;

import com.codegym.demo23.model.LearningOutcome;

import java.util.List;
import java.util.Optional;

public interface OutcomeService {
    List<LearningOutcome> findAll();
    Optional<LearningOutcome> findById(Long id);
    void save(LearningOutcome learningOutcome);
    void remove(Long id);
}
