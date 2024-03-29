package org.example.functionalInterfaces;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<LocalDate> s1= () -> LocalDate.of(2025,10,24);

        System.out.println(s1.get());

    }
}
