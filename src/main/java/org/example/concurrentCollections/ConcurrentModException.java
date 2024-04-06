package org.example.concurrentCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcurrentModException {


    public static void main(String[] args) {

        List<String> names = Arrays.asList("Palava","Sanjana");

        for (String name: names) {


            names.add(name);

        }


    }
}
