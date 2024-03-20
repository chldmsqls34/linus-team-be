package com.linus.api.grade;



public interface GradeService {

    public int getTotalScore(Grade grade);

    public double findAverage(int totalScore);
}
