package com.lld.designPattern.creational.prodBuilder;

public class Client {

    public static void main(String[] args) {
        /*Builder builder = new Builder();
        builder.setAge(12);
        builder.setName("Naman");
        builder.setGradYear(2022);

        Student student = new Student(builder);*/

        Student st  = Student.getBuilder().
                setAge(12).
                setName("Mohit").
                setGradYear(2022).
                build();

        System.out.println("DEBUG");
    }
}
