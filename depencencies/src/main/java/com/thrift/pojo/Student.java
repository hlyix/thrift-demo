package com.thrift.pojo;

import java.util.List;

public class Student {

    private String name;
    private int gender;
    private int age;
    private double height;
    private String number;
    private String School;
    private List<String> familyMember;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public List<String> getFamilyMember() {
        return familyMember;
    }

    public void setFamilyMember(List<String> familyMember) {
        this.familyMember = familyMember;
    }
}
