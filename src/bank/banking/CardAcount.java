package bank.banking;

import bank.banking.database.Database;

import java.time.LocalDate;
import java.util.Objects;

public class CardAcount extends Acount {
    private Integer pin;
    private Double limitAmount;
    private LocalDate thruDate;
    public CardAcount(){

    }
    public CardAcount (Integer number, String name, Double balance){
        super(number,name,balance);
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public Double getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(Double limitAmount) {
        this.limitAmount = limitAmount;
    }

    public LocalDate getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDate thruDate) {
        this.thruDate = thruDate;
    }

    @Override
    protected final void deposit(Double amount) {
        // what's day is today
        LocalDate now = LocalDate.now();
        if (isExpired((thruDate))){
            System.out.println("Card is Expired!");
        }
        super.deposit(amount);
    }

    @Override
    protected final void withrawal(Double amount) {
        if (amount > limitAmount){
            System.out.println("Over Amount ");
            return;
        }
        if (isExpired(thruDate)){
            System.out.println("Card is Expired ");
        }
        super.withrawal(amount);
    }

    @Override
    protected void showBalane() {
        System.out.println("Acount Name : "+getName());
        System.out.println("Acount Number : "+ getNumber());
        System.out.println(" Balacne : "+getBalance());
        System.out.println("Pin : "+ pin);
        System.out.println("ThruDate : "+ thruDate);
        System.out.println("LimitAmount : "+ limitAmount);
        System.out.println("==========");
    }
    private boolean isExpired(LocalDate date){
        LocalDate now = LocalDate.now();
        return  now.isAfter(date);
    }
}
