package com.codegym.demo23.repository;

import com.codegym.demo23.model.LearningActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<LearningActivity, Long> {
}
