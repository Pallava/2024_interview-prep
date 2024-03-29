package org.example.methodreferences;

import org.example.methodreferences.interfaces.StudentProvider;
import org.example.methodreferences.model.Student;

import java.time.LocalDate;
import java.util.function.Supplier;

public class MethodReference {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method reference");
        //static method reference
        //Referencing static method of ThreadTask ,
        // here implementation of run()
        // i.e the Runnable interface abstract method is being called
        Runnable runnable = ThreadTask::TableOf2;
        Thread t1 = new Thread(runnable);
        t1.start();


        //instance methods reference
        //needs to call on the object of the class
        ThreadTask task2 = new ThreadTask();
        Runnable runnable1 = task2::printNumbers;
        Thread t2 = new Thread(runnable1);
        t2.start();

        //constructor reference
        //Student::new -> calls the constructor with params

        ThreadTask task3 = new ThreadTask();
        StudentProvider provider = Student::new;
        System.out.println(
                provider.createStudent("Pallava",
                        30,1,"A001","male","CS"));


        Supplier<LocalDate> s = ThreadTask::getDate;



    }
}
