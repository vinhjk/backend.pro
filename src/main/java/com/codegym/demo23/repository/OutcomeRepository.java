package com.codegym.demo23.repository;

import com.codegym.demo23.model.LearningOutcome;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutcomeRepository extends JpaRepository<LearningOutcome, Long> {
}
