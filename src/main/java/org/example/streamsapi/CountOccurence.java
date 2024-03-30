package org.example.streamsapi;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountOccurence {

    public static void main(String[] args) {

        String str= "Communication";
        String[] strArray = str.split("");

        Arrays.stream(strArray)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().forEach(System.out::println);



    }
}
