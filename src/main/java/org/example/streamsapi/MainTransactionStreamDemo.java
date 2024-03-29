package org.example.streamsapi;

import org.example.streamsapi.model.Trader;
import org.example.streamsapi.model.Transactions;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MainTransactionStreamDemo {

    public static void main(String[] args) {

        SetUp setUp = new SetUp();
        //Question 1: Get transaction in 2011 and sort by value.
        getTr2011();
        //Question 2:Get all the cities of all the traders.
        System.out.println("*******************************************************");
        getCitiesOfTraders();
        //Question 3: Finds all traders from Cambridge and sort them by name
        getTraderByCity("Cambridge");
        System.out.println("*******************************************************");
        //Question 4: Returns a string of all traders’ names sorted alphabetically
        getTraderNamesalphabetically();
        System.out.println("*******************************************************");
        //Question 5 : Returns a string of all traders’ names sorted alphabetically Using Joining which is more efficient.
        getTraderNamesalphabeticallyUsingJoin();
        System.out.println("*******************************************************");
        //Find out if any trader is from Milan?
        getTraderByCity("Milan");
        System.out.println("*******************************************************");
        //Prints all transactions’ values from the traders living in Cambridge
        printTransactionValuesByCity("Cambridge");
        //Get Highest transaction
        getHighestTransaction();
        //Get Smallest transaction
        getSmallestTransaction();
        //Group transactions by currencies.
        groupTransactionByCurr();



    }

    private static void groupTransactionByCurr() {
      Map<Currency , List<Transactions>> map=  SetUp.getTransactions().stream()
                .collect(Collectors.groupingBy(Transactions::getCurrency));
      map.entrySet().stream().forEach(System.out::println);

    }

    private static void getSmallestTransaction() {
        System.out.println("Get Smallest transaction");
        Optional<Transactions> min=  SetUp.getTransactions().stream()
                .min(Comparator.comparing(Transactions::getValue));
        System.out.println(min.get());


    }

    private static void getHighestTransaction() {
    System.out.println("Get Highest transaction");
    Optional<Transactions> max = SetUp.getTransactions().stream()
                //.map(Transactions::getValue)
                .max(Comparator.comparing(Transactions::getValue));
        System.out.println(max.get());

    }

    private static void printTransactionValuesByCity(String city) {
        System.out.println("Prints all transactions’ values from the traders living in Cambridge");
        SetUp.getTransactions().stream()
                .filter(a -> a.getTrader().getCity().equals(city))
                .map(a -> a.getValue())
                .collect(toList())
                .forEach(System.out::println);
    }

    private static void getTraderNamesalphabeticallyUsingJoin() {
        System.out.println("Question 5 : Returns a string of all traders’ names sorted alphabetically Using Joining which is more efficient.");
        String str = SetUp.getTransactions()
                .stream()
                .map(t -> t.getTrader().getName())
                .sorted()
                .distinct()
                .collect(joining(","));
        System.out.println(str);
    }

    private static void getTraderNamesalphabetically() {
        System.out.println("Question 4: Returns a string of all traders’ names sorted alphabetically");
        SetUp.getTransactions()
                .stream()
                .map(Transactions::getTrader)
                .sorted(Comparator.comparing(Trader::getName))
                .distinct()


                .forEach(System.out::println);
        System.out.println("*******************************************************");

    }

    private static void getTraderByCity(String city) {
        System.out.println("Question 3: Finds all traders from Cambridge and sort them by name");
        SetUp.getTransactions()
                .stream()
                .map(Transactions::getTrader)
                .filter(a -> a.getCity().equals(city))
                .sorted(Comparator.comparing(Trader::getName))
                .distinct()
                .collect(toList()).forEach(System.out::println);
        System.out.println("*******************************************************");
    }

    private static void getCitiesOfTraders() {
        System.out.println("Question 2:Get all the cities of all the traders.");
       List<String> cities =  SetUp.getTransactions()
                .stream()
                .map(a -> a.getTrader().getCity())
               .distinct()
                .collect(toList());
        System.out.println(cities);
        System.out.println("*******************************************************");
    }

    private static void getTr2011() {
        System.out.println("Question 1: Get transaction in 2011 and sort by value.");
        SetUp.getTransactions()
                .stream().filter( t -> t.getYear()==2011)
                .sorted(Comparator.comparingInt(Transactions::getValue))
                .collect(toList())
                .forEach(System.out::println);

    }
}
