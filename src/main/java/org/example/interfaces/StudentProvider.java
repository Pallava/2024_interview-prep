package org.example.interfaces;

import org.example.model.Student;

@FunctionalInterface
public interface StudentProvider {

   abstract  Student getStudent();
}


