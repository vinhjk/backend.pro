package com.codegym.demo23.repository;

import com.codegym.demo23.model.LearningProgram;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramRepository extends JpaRepository<LearningProgram, Long> {
}
