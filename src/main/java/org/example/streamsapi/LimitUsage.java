package org.example.streamsapi;

import java.util.stream.Stream;

public class LimitUsage {

    public static void main(String[] args) {
        Stream<Integer> intStream =  Stream.of(10,29,90,20,10,30,20,29);
        intStream.limit(3).forEach(System.out::println);
        //Limits the itertaion to 3
    }
}
