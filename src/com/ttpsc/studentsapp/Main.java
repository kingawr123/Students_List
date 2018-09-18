package com.ttpsc.studentsapp;

import com.ttpsc.studentsapp.config.AppInitializator;
import com.ttpsc.studentsapp.controller.StudentsController;
import com.ttpsc.studentsapp.model.Student;
import com.ttpsc.studentsapp.repository.inmemory.StudentsRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AppInitializator.initializeApplication();
        List<Student> studentList = StudentsRepository.studentList;

        StudentsController.showStudentsList(studentList);
    }
}
