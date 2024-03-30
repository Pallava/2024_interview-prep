package org.example.streamsapi;

import java.util.stream.Stream;

public class SkipUsage {

    public static void main(String[] args) {

        Stream<Integer> intStream =  Stream.of(10,29,90,20,10,30,20,29);
        intStream.skip(3).forEach(System.out::println);
        //skips first 3 elements
    }
}
