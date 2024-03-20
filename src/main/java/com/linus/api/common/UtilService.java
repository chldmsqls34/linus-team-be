package com.linus.api.common;

public interface UtilService {


    int createRandomInteger(int start, int gapBetweenStartAnd);
    double createRandomDouble(int start, int gapBetweenStartAndEnd);

    String createRandomName();
    String createRandomTitle();
    String createRandomContent();
    String createRandomCompany();
    String createRandomUsername();
}
