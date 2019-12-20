package com.codegym.demo23.service.Impl;

import com.codegym.demo23.model.LearningActivity;
import com.codegym.demo23.repository.ActivityRepository;
import com.codegym.demo23.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityRepository activityRepository;
    @Override
    public List<LearningActivity> findAll() {
        return activityRepository.findAll();
    }

    @Override
    public Optional<LearningActivity> findById(Long id) {
        return activityRepository.findById(id);
    }

    @Override
    public void save(LearningActivity learningActivity) {
        activityRepository.save(learningActivity);
    }

    @Override
    public void remove(Long id) {
        activityRepository.deleteById(id);
    }
}
