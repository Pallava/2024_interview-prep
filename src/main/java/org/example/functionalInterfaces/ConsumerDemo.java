package org.example.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<String> c1 = s -> System.out.println(s.concat("- is an Avenger"));

        c1.accept("Thor ");
        c1.accept("Captain america ");
        c1.accept("Iron man ");
        Consumer<String> c2 = s -> System.out.println(s.concat("- is not an Avenger"));

        c1.andThen(c2).accept("Pallava");

    }
}
