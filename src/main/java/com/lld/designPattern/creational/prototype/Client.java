package com.lld.designPattern.creational.prototype;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Client {
    public static void fillRegistry(StudentRegistry registry){
        Student aprBatchStudent = new Student();
        aprBatchStudent.setBatch("April 21");
        aprBatchStudent.setAverageBatchPsp(89.0);

        registry.register("aprilBatch",aprBatchStudent);

        IntelligentStudent aprBatchIntelligentStudent = new IntelligentStudent();
        aprBatchIntelligentStudent.setBatch("April Intelligent 21");
        aprBatchIntelligentStudent.setAverageBatchPsp(99);
        aprBatchIntelligentStudent.setIq(99);

        registry.register("aprilIntelligentBatch",aprBatchIntelligentStudent);

    }
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student siddharth = registry.getRegistry("aprilBatch").clone();
        siddharth.setName("Siddharth");
        siddharth.setAge(24);
        siddharth.setStudentPsp(91.0);



        Student intelligentMohit = registry.getRegistry("aprilIntelligentBatch").clone();
        intelligentMohit.setName("Mohit");
        intelligentMohit.setAge(26);

        System.out.println("debug");

    }
}
