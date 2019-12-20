package com.codegym.demo23.model;

import javax.persistence.*;

public class LearningActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String learningActivity;

    @ManyToMany
    @JoinColumn(name = "learningOutcome")
    private LearningOutcome learningOutcome;

    public LearningActivity(){}

    public LearningActivity(String learningActivity){this.learningActivity = learningActivity;}

    public String getLearningActivity() {
        return learningActivity;
    }

    public void setLearningActivity(String learningActivity) {
        this.learningActivity = learningActivity;
    }

    public LearningOutcome getLearningOutcome() {
        return learningOutcome;
    }

    public void setLearningOutcome(LearningOutcome learningOutcome) {
        this.learningOutcome = learningOutcome;
    }
}
