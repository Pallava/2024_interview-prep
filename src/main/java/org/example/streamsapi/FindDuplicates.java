package org.example.streamsapi;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicates {


    public static void main(String[] args) {

        Stream<Integer> intStream =  Stream.of(10,29,90,20,10,30,20,29);

        Set<Integer> integerSet = new HashSet<>();
        //check if 10 is not in set then add to set
        //29 > add
        //90 > add
        //20 > add
        //10 > present in the set -> print
        //30 > add
        //20 > present in the set -> print

        intStream.filter(a -> !integerSet.add(a)).forEach(
                System.out::println
        );
        System.out.println(integerSet);
    }
}
