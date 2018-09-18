package com.ttpsc.studentsapp.repository.inmemory;

import com.ttpsc.studentsapp.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentsRepository {

    public static List<Student> studentList = new ArrayList<>();

    public static void initializeStudentsRepository(){
        studentList.add(new Student(1, "Jan", "Kowalski", false));
        studentList.add(new Student(2, "Marian", "Kowalski", true));
        studentList.add(new Student(3, "Janusz", "Kowalski", false));
        studentList.add(new Student(4, "Eugeniusz", "Kowalski", true));
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void deleteStudent(Student student){
        studentList.remove(student);
    }

    public void markStudentAsPresent(Student student){
        student.setAttendance(true);
    }
}
