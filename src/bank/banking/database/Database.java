package bank.banking.database;

import bank.banking.CardAcount;
import bank.banking.SavingAcount;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Database {

    public static CardAcount cardAcount(){
        CardAcount cardAcount = new CardAcount(88889999,"Dane",1000.0);
        cardAcount.setPin(1234);
        cardAcount.setLimitAmount(1000.0);
        cardAcount.setThruDate(LocalDate.now().plus(1, ChronoUnit.DAYS));

        return cardAcount;
    }
    public static SavingAcount saving(){
        SavingAcount saving = new SavingAcount(12345,"Dane",100.0);
        return saving;
    }
}
