package com.lld.designPattern.creational.builder;

public class Client {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setAge(12);
        builder.setName("Naman");
        builder.setGradYear(2022);

        Student student = new Student(builder);
        System.out.println("DEBUG");
    }
}
