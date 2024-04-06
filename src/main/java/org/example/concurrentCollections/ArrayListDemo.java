package org.example.concurrentCollections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {


    public static void main(String[] args) {

        ArrayList<String> list =new ArrayList<>();
        list.add("Pallava");
        list.add("Sanajana");
        list.add("1");list.add("2");list.add("3");list.add("4");
        list.add("56");list.add("6");list.add("7");list.add("8");

        for (String name1: list) {

            list.remove(name1);

        }
        while (list.iterator().hasNext()){

            String str = list.iterator().next();
         //   ArrayList.class.mo
            if(str=="Pallava"){

                list.remove("Pallava");

            }


        }



    }

}
