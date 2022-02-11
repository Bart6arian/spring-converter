package com.kodilla.kodillaconverter.domain;

public class MyCustomClass {
    private String filedOne;
    private String fieldTwo;
    private String fieldThree;


    public MyCustomClass(String filedOne, String fieldTwo, String fieldThree) {
        this.filedOne = filedOne;
        this.fieldTwo = fieldTwo;
        this.fieldThree = fieldThree;
    }

    public String getFieldThree() {
        return fieldThree;
    }

    public String getFieldTwo() {
        return fieldTwo;
    }

    public String getFiledOne() {
        return filedOne;
    }
}
