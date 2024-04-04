package org.example.immutabilty;

import java.util.HashSet;
import java.util.Set;

public class ImmutableMainclient {

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Sanjana");
        stringSet.add("Shetty");
        ImmutableClass immutableClass = new ImmutableClass(1,"Pallava", stringSet);

        System.out.println(immutableClass);
        stringSet.add("Shetty_1");
        System.out.println(immutableClass);

        int id = immutableClass.getId();
        String name = immutableClass.getName();

        id = 2;
        name= "Sanjana";

        System.out.println("id:" + id +", name : "+name);
        System.out.println("id:" + immutableClass.getId() +", name : "+immutableClass.getName());


       Set<String>localSet =   immutableClass.getSet();
        localSet.add("Yasha");
        localSet.add("Thrisha");

        System.out.println("Local Set after adding 2 values : " + localSet); //original set is altered because it retuns same reff
        System.out.println(immutableClass); // adds yasha & thrisha here , defying the immutablility

        //to fix it in getter return new reference







    }
}
