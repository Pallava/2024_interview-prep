package org.example.methodreferences.interfaces;

import org.example.methodreferences.model.Student;

@FunctionalInterface
public interface StudentProvider {

     Student createStudent(String name, int age, int grade, String studentID, String gender, String major);

}


