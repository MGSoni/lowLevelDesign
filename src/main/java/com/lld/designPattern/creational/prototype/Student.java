package com.lld.designPattern.creational.prototype;

public class Student implements Prototype{

    private int age;
    private String name;
    private String batch;
    private double averageBatchPsp;
    private double studentPsp;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }
    public Student(){};
    public Student(Student student){
        this.age = student.age;
        this.name = student.name;
        this.batch = student.batch;
        this.averageBatchPsp = student.averageBatchPsp;
        this.studentPsp = student.studentPsp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    //For child class to extend student we need copy constr constructor
    //new clone method will just return copy constructor
   /* @Override
    public Student clone() {
        Student student = new Student();
        this.age = student.age;
        this.name = student.name;
        this.batch = student.batch;
        this.averageBatchPsp = student.averageBatchPsp;
        this.studentPsp = student.studentPsp;
        return student;
    }*/

}
