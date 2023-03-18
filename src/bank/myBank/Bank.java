package bank.myBank;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAcount> bankAcounts= new ArrayList<>();
    //Withdraw money 
    // Transter
    public void transter(String numberSource, String numberTarget, double money) {
        BankAcount acountSource = findAcountByAcountNumber(numberSource);
        if (acountSource == null) {
            System.out.println("Invaild source");
            return;
        }
        BankAcount acountTarget = findAcountByAcountNumber(numberTarget);
        if (acountTarget == null) {
            System.out.println("Invaild acount target");
            return;
        }
        Withdraw(numberSource, money);
        deposite(numberTarget, money);
    }

    // Draw money
    public void Withdraw(String acountNumber, double money) {
        BankAcount acount = findAcountByAcountNumber(acountNumber);
        if (money <= 0) {
            System.out.println("Invaild amount");
            return;
        }
        if (acount != null) {
            if (acount.getBalance() >= money) {
                double newAmount = acount.getBalance() - money;
                acount.setBalance(newAmount);
            } else {
                System.out.println("The balance is not enough");
            }
        } else {
            System.out.println("Invaild Acount number");
        }
    }

    // deposite money to bank
    public void deposite(String acountNumber, double money) {
        BankAcount acount = findAcountByAcountNumber(acountNumber);
        if (money <= 0) {
            System.out.println("Invaild amount");
            return;
        }
        if (acount != null) {
            double totalAmount = acount.getBalance() + money;
            acount.setBalance(totalAmount);
        } else {
            System.out.println("Invaild Acount number");
        }
    }

    private BankAcount findAcountByAcountNumber(String acountNumber) {
        for (BankAcount acount : bankAcounts) {
            if (acount.getAccountNumber().equals(acountNumber)) {
                return acount;
            }
        }
        return null;
    }

    public void displayAllAcount() {
        for (BankAcount acc : bankAcounts) {
            System.out.println(acc.toString());
        }
    }

    public void openAcount(BankAcount bankAcount) {
        bankAcounts.add(bankAcount);
    }

    public ArrayList<BankAcount> getBankAcounts() {
        return bankAcounts;
    }

    public void setBankAcounts(ArrayList<BankAcount> bankAcounts) {
        this.bankAcounts = bankAcounts;
    }
}
