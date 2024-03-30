package org.example.streamsapi.programs;

import java.util.stream.Stream;

public class SumOfNumber {

    public static void main(String[] args) {

       int sum =  Stream.iterate(0, i-> i+1)
                .limit(3)
               .parallel()
                .reduce(Integer::sum).get();
        System.out.println("Sum : " + sum);

                //.forEach(System.out::println);

    }
}
