package com.ttpsc.studentsapp.model;

public class Student {
    private int id;
    private String firstName;
    private String secondName;
    private boolean attendance;

    public Student(int id, String firstName, String secondName, boolean attendance) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.attendance = attendance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public boolean isAttendance() {
        return attendance;
    }

    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    }

}
