package org.example.streamsapi;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsSortingDemo {


    public static void main(String[] args) {
        List<Integer> list1 =  List.of(10,20,30,5,8,12);



        List<Integer> sortedList = list1.stream().sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList());
        List<Integer> sortedList1 =  list1.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList1);
        System.out.println(sortedList);
    }






}
