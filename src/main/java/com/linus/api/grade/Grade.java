package com.linus.api.grade;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString

public class Grade {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int avg;

    @Builder(builderMethodName = "builder")
    public Grade(String name, int kor, int eng, int math, int avg) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.avg = avg;
    }
}
