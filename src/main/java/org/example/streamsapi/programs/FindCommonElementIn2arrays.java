package org.example.streamsapi.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElementIn2arrays {

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        int b[] = {4,5,6,7,8};

      Arrays.stream(a)
                .filter(number -> Arrays.stream(b).anyMatch(barray-> barray==number))
              .boxed() // returns stream of boxed to integer from int
              .collect(Collectors.toList()).forEach(System.out::println);

    }


}
