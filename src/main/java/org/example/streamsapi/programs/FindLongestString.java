package org.example.streamsapi.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindLongestString {
    public static void main(String[] args) {

        String[] str = {"apple","banana","avacado","apple"};

        int maxVal = Arrays.stream(str).mapToInt(String::length).max().getAsInt();
        System.out.println(maxVal);

        LinkedHashSet<String> hs = new LinkedHashSet<>();
        Arrays.stream(str).filter(a-> !hs.add(a)).toList().forEach(System.out::println);

    }
}
