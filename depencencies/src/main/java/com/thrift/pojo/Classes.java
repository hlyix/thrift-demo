package com.thrift.pojo;

import java.util.List;

public class Classes {

    private int studentSum;
    private List<Student> students;
    private List<Teacher> teachers;
    private String classNum;
    private Teacher headTeacher;

    public int getStudentSum() {
        return studentSum;
    }

    public void setStudentSum(int studentSum) {
        this.studentSum = studentSum;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public Teacher getHeadTeacher() {
        return headTeacher;
    }

    public void setHeadTeacher(Teacher headTeacher) {
        this.headTeacher = headTeacher;
    }
}
