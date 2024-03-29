package org.example.streamsapi;

import org.example.streamsapi.model.Trader;
import org.example.streamsapi.model.Transactions;

import java.util.Arrays;
import java.util.Currency;
import java.util.List;

public class SetUp {

    private static  List<Transactions> transactions;

    SetUp() {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        transactions = Arrays.asList(
                new Transactions(brian, 2011, 300, Currency.getInstance("USD")),
                new Transactions(raoul, 2012, 1000,Currency.getInstance("EUR")),
                new Transactions(raoul, 2011, 400,Currency.getInstance("USD")),
                new Transactions(mario, 2012, 710, Currency.getInstance("INR")),
                new Transactions(mario, 2012, 700,Currency.getInstance("USD")),
                new Transactions(alan, 2012, 950,Currency.getInstance("INR"))
        );
    }
    public static List<Transactions> getTransactions()
    {
        return transactions;
    }
}
