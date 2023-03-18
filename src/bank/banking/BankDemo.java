package bank.banking;

import bank.banking.database.Database;

import java.time.LocalDate;

public class BankDemo {
    public static void main(String[] args) {
        CardAcount cardAcount = new CardAcount();
        cardAcount.setNumber(88889999);
        cardAcount.setPin(1234);
        cardAcount.setThruDate(LocalDate.now());
        if (Database.cardAcount().getNumber().equals(cardAcount.getNumber())){
            cardAcount=Database.cardAcount();
        }else {
            System.out.println("Invalid Card!");
            return;
        }
        cardAcount.deposit(500.0);
        cardAcount.withrawal(200.0);
        cardAcount.showBalane();

        SavingAcount savingAcount = new SavingAcount();
        savingAcount.setInter(new RildRate());
        savingAcount.showBalane();

        System.out.println("****************");
        SavingAcount mySaving = Database.saving();
        mySaving.setInter(new DollarRate());
        mySaving.calculateInterrest();
        System.out.println(mySaving.getInterest());
    }
}
