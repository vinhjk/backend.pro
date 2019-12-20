package com.codegym.demo23.service.Impl;

import com.codegym.demo23.model.LearningProgram;
import com.codegym.demo23.repository.ProgramRepository;
import com.codegym.demo23.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProgramServiceImpl implements ProgramService {

    @Autowired
    ProgramRepository programRepository;
    @Override
    public List<LearningProgram> findAll() {
        return programRepository.findAll();
    }

    @Override
    public Optional<LearningProgram> findById(Long id) {
        return programRepository.findById(id);
    }

    @Override
    public void save(LearningProgram learningProgram) {
       programRepository.save(learningProgram);
    }

    @Override
    public void remove(Long id) {
        programRepository.deleteById(id);
    }

}
