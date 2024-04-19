package org.example.streamsapi.RameshFadtarePrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RameshFadTarePrograms {

    public static void main(String[] args) {
        //Java 8 Program to Find the Frequency of Each Character in a Given String
        String str  = "Pallava";
        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(String::valueOf,Collectors.counting()))
                .entrySet()
                .forEach(map1 -> System.out.println(map1.getKey() +" :" + map1.getValue()));

        System.out.println("****************************************************");

        //Java 8 Program to Find the Maximum Number and Minimum Number in a List
       List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

      int max =  numbers.stream().mapToInt(Integer::intValue).max().getAsInt();
        int min =  numbers.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("Max "+ max);
        System.out.println("Min "+ min);

        System.out.println("****************************************************");
        //Java 8 Program to Find the Second Largest Number in the List of Integers
        List<Integer> numbers_1 = Arrays.asList(1, 3, 4, 5, 6, 6, 7, 2);
        int sec_largets = numbers_1.stream().distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get().intValue();
        System.out.println("Sceond Largest : " + sec_largets);
        System.out.println("****************************************************");
        //Java 8 Program to Find the Sum of All Digits of a Number

       int sum =  numbers_1.stream().reduce((a,b) -> a+b).get();
        System.out.println("Sum : "+ sum);
        System.out.println("****************************************************");
        //Java 8 Program to Print Even Numbers from a List
        String even= numbers_1.stream().distinct().filter(a->a%2==0).map(String::valueOf).collect(Collectors.joining(","));
        System.out.println("Even nos:" + even);

        System.out.println("****************************************************");
        //Java 8 Program to Remove Duplicate Elements from a List
        numbers_1.stream().distinct().forEach(System.out::println);
        System.out.println("****************************************************");
        //Java 8 Program to Retrieve Last Element of a List of Strings
        List<String> strings = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");
        strings.stream().skip(strings.size()-1).forEach(System.out::print);
       String last =  strings.stream().reduce((a,b) -> b).get();
        System.out.println("Last element"+ last);
        System.out.println("****************************************************");
        //Java 8 Program to Reverse Each Word of String
        String input = "Java 8 is great";
       String rev =  Arrays.stream(input.split(" "))
                .map(a->new StringBuilder(a).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("reversed :" + rev);
        System.out.println("****************************************************");
        //Java 8 Program to Sort List of Strings Alphabetically
        String sorted = strings.stream().sorted().collect(Collectors.joining(","));
        System.out.println("Sorted values "+ sorted);
        System.out.println("****************************************************");
        //convert List to map
        strings.stream().collect(Collectors.toMap(String::valueOf , String::length))
                .entrySet().forEach(e -> System.out.println(e.getKey() +" : "+ e.getValue()));
        System.out.println("****************************************************");
        //frequency of chars in string







    }
}
