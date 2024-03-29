package org.example.functionalInterfaces;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<Integer,Integer> f1 = i -> i*i;

        System.out.println("Function :" +  f1.apply(5));

        Function<Integer,Integer> f2 = i -> i+2;

        System.out.println("Function Chaining andThen : " + f1.andThen(f2).apply(10));
        System.out.println("Function Chaining compose: " + f1.compose(f2).apply(10)); //12 * 12 = 144

    }
}
