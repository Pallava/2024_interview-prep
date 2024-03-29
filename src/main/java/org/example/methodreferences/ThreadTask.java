package org.example.methodreferences;

import org.example.methodreferences.model.Student;

import java.time.LocalDate;

public class ThreadTask {


    public static void TableOf2() {

        for (int i = 1; i <= 10; i++) {

            System.out.println(i * 2);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

        public void printNumbers() {
            for (int i = 1; i <= 10; i++) {

                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }

        public Student getStudent(){

        return new Student("pallava",34,1,"A001","Male","CSE");

        }

        public static LocalDate getDate(){

        return LocalDate.of(2024,11,23);

        }





}
