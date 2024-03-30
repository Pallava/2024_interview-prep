package org.example.optionalclass;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class OptionalDemo {

    public static void main(String[] args) {

        Optional<String> op1 = Optional.of("Pallava");
       // System.out.println(Optional.of(null).get()); //gives numm pointer
      //  System.out.println( Optional.ofNullable(null).get()); //no such element exception
        System.out.println(Optional.empty());
        Consumer<String> c  = a -> System.out.println("Value is present");
        op1.ifPresent(c); //check if value is present or not. if present perform the consumer
       Optional<String> nameOptional =  getName("PallavaShetty");
       nameOptional.ifPresent( a-> System.out.println("Name is present"));


        Optional<String> nameOptional2 =  getName(null);
        Supplier<String> supplier = () -> {
            return "FALSE";
        };
        System.out.println(nameOptional2.isPresent()); //true or false
        System.out.println(nameOptional2.orElse("doesnt contain value")); // returns other value
        System.out.println(nameOptional2.orElseGet(supplier)); // returns supplier value
      //  System.out.println(nameOptional2.orElseThrow()); //throws no element exception if not present
        Optional<String> nameOptional3 =  getName("Pallava");
        nameOptional3.ifPresent(a-> System.out.println("contains value"));//retrns consumer


    }

    public static  Optional<String> getName(String name){

       return  Optional.ofNullable(name);
    }
}
