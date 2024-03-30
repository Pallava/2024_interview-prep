package org.example.streamsapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

    public static void main(String[] args) {

        List<String> c1= Arrays.asList("Infy","wipro","TCS");
        List<String> c2= Arrays.asList("HCL","Synechron","AVIVA");
        List<String> c3= Arrays.asList("Meta","Netflix","Google","HCL");
        List<List<String>> listOfListofStrings =
                Arrays.asList(c1, c2, c3);
        System.out.println(listOfListofStrings);

      String str =   listOfListofStrings.stream().
              flatMap(c -> c.stream()).
              distinct().
              collect(Collectors.joining(","));
        System.out.println("" + str);





    }
}
