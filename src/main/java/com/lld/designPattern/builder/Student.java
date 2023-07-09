package com.lld.designPattern.builder;

public class Student {

    String name;
    int age;
    double psp;
    String universityName;
    String batch;
    long id;
    int gradYear;
    String phoneNumber;

    public Student(Builder builder){
        if(builder.gradYear>2022){
            throw new IllegalArgumentException("Grad year cannot be greater than 2022");
        }
        this.gradYear = builder.getGradYear();
        this.age = builder.getAge();
        this.name = builder.getName();
    }


}
