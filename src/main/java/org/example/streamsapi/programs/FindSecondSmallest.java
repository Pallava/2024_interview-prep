package org.example.streamsapi.programs;

import java.util.Arrays;

public class FindSecondSmallest {

    public static void main(String[] args) {


        int [] num = {1,3,4,2,10,1};

       int secondSmallest = Arrays.stream(num).distinct().sorted().skip(1).findFirst().getAsInt();
        System.out.println("second smallest :" + secondSmallest);


    }
}
