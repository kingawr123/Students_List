package com.ttpsc.studentsapp.config;

import com.ttpsc.studentsapp.repository.inmemory.StudentsRepository;

public class AppInitializator {

    public static void initializeApplication(){
        StudentsRepository.initializeStudentsRepository();
    }
}
