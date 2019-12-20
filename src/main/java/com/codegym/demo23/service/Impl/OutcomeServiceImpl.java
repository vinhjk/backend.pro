package com.codegym.demo23.service.Impl;

import com.codegym.demo23.model.LearningOutcome;
import com.codegym.demo23.repository.OutcomeRepository;
import com.codegym.demo23.service.OutcomeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OutcomeServiceImpl implements OutcomeService {

    @Autowired
    private OutcomeRepository outcomeRepository;
    @Override
    public List<LearningOutcome> findAll() {
        return outcomeRepository.findAll();
    }

    @Override
    public Optional<LearningOutcome> findById(Long id) {
        return outcomeRepository.findById(id);
    }

    @Override
    public void save(LearningOutcome learningOutcome) {
        outcomeRepository.save(learningOutcome);
    }

    @Override
    public void remove(Long id) {
        outcomeRepository.deleteById(id);
    }
}
