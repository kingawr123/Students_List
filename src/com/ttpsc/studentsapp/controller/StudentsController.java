package com.ttpsc.studentsapp.controller;

import com.ttpsc.studentsapp.model.Student;

import java.util.List;

public class StudentsController {

    private static final String SEPARATOR = "------------------------------";

    public static void showStudentsList(List<Student> studentList){
        System.out.println("STUDENTS LIST");
        System.out.println(SEPARATOR);
        for (Student student : studentList){
            System.out.println("ID: " +student.getId());
            System.out.println("FIRSTNAME: " + student.getFirstName());
            System.out.println("SECOND NAME: " + student.getSecondName());
            System.out.println("ATTENDANCE: " + getAttendanceStatusInString(student));
            System.out.println(SEPARATOR);
        }
    }

    public static String getAttendanceStatusInString(Student student){
        if(student.isAttendance()){
            return "Absent";
        }
        else return "Not Absent";
    }
}
