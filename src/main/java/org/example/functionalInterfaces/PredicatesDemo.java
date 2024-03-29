package org.example.functionalInterfaces;

import java.util.function.Predicate;

public class PredicatesDemo {

    public static void main(String[] args) {

        Predicate<String> p1 = s -> s.length() > 10;
        System.out.println("Predicate - to check length"+ p1.test("Pallava"));
        Predicate<String> p2 = s -> s.length() %2 == 0;
        //Predicate chaining
        System.out.println( "Predictae chanining and :" +p1.and(p2).test("Pallav"));
        System.out.println( "Predictae chanining or : " +p1.or(p2).test("Pallav"));
        System.out.println( "Predictae chanining  negate : " +p1.negate().test("Pallav"));

    }
}
