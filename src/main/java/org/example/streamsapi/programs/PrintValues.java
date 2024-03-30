package org.example.streamsapi.programs;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class PrintValues {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,40,50,55,60,70,23,20,90,6);

        //sum of all numbers
        int sum = list.stream().reduce(Integer::sum).get();
        System.out.println("Sum of all numbers :"+sum);

        //average
        double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("Average of all nums :"+avg);

        //square , filter >200 , average
        double avg1=list.stream().map(e->e*e)
                .filter(e->e>=200)
                .mapToInt(e -> e)
                .average()
                .getAsDouble();
        System.out.println("Square , filter & average : " + avg1);

        //Print numbers start with 2

        List<Integer> a =  list.stream().map(String::valueOf)
                        .filter(c->c.startsWith("2"))
                                .map(Integer::valueOf)
                                    //.forEach(System.out::print);
                                        .toList();
        System.out.println("starting with 2  are : "  + a);

        //Print duplicates
        Set<Integer> set = new HashSet<>();
        List<Integer> dupls=list.stream().filter(dp-> !set.add(dp)).collect(Collectors.toList());
        System.out.println("duplicates   are : "  + dupls);

        //Max & min
        int max = list.stream().max(Comparator.comparing(z -> z)).get();
        System.out.println("Max value : "+ max);
        int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min value : "+ min);

        //Sorting
        List<Integer>sorted1 =  list.stream().sorted().collect(toList());
        System.out.println("Asc sorted order :"+ sorted1 );
        List<Integer>sorted2 =  list.stream().sorted(Comparator.reverseOrder()).collect(toList());
        System.out.println("Desc sorted order :"+ sorted2 );

        //ignore first 5 and print only 2
        List<Integer>ignorefirst5 = list.stream().skip(5).limit(2).collect(toList());
        System.out.println("Ignore first 5 "+ ignorefirst5);

        //second highest
       int second_highest =  list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second highest value :" + second_highest);

        //second lowest
        int sec_L = list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println("Second lowest value :" + sec_L);



    }
}
