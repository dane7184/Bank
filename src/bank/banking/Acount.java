package bank.banking;

import bank.banking.database.Database;

public abstract class Acount {
    private Integer number;
    private String name;
    private Double balance;

    public Acount(){

    }

    public Acount(Integer number, String name, Double balance){
        this.number=number;
        this.name= name;
        this.balance=balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    protected void deposit(Double amount){
        if (amount < 0){
            System.out.println("Are you killing me");
            return;
        }
        if (amount == 0){
            System.out.println("You can not deposit");
        }
        balance += amount;
    }
    protected void withrawal(Double amount){
        if (amount < 0){
            System.out.println("Are you killing me");
            return;
        }
        if (amount > balance){
            System.out.println("Insufficint balance");
            return;
        }
        balance-=amount;
    }
    protected abstract void showBalane();

}
