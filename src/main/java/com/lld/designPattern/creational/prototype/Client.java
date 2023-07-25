package com.lld.designPattern.creational.prototype;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Client {
    public static void fillRegistry(StudentRegistry registry){
        Student aprBatchStudent = new Student();
        aprBatchStudent.setBatch("April 21");
        aprBatchStudent.setAverageBatchPsp(89.0);

        registry.register("aprilBatch",aprBatchStudent);

    }
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student siddharth = registry.getRegistry("aprilBatch").clone();
        siddharth.setName("Siddharth");
        siddharth.setAge(24);
        siddharth.setStudentPsp(91.0);

        System.out.println("debug");

    }
}
