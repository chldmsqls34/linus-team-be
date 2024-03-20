package com.linus.api.grade;



public class GradeServiceImpl implements GradeService {

    private static GradeService instance = new GradeServiceImpl();

    private GradeServiceImpl(){}
    public static GradeService getInstance(){
        return instance;
    }



    @Override
    public int getTotalScore(Grade grade) {
        int totalScore = grade.getKor()+grade.getEng()+grade.getMath();
        return totalScore;
    }

    @Override
    public double findAverage(int totalScore) {
        int average = totalScore / 3;
        return average;
    }

}
