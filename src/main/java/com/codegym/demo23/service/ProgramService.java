package com.codegym.demo23.service;

import com.codegym.demo23.model.LearningProgram;

import java.util.List;
import java.util.Optional;

public interface ProgramService {
    List<LearningProgram> findAll();
    Optional<LearningProgram> findById(Long id);
    void save(LearningProgram learningProgram);
    void remove(Long id);
}
