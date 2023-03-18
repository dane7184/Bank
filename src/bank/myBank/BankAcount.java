package bank.myBank;

public class BankAcount {
    private String AccoutName;
    private String AccountNumber;
    private double balance;

    public BankAcount(String accoutName, String accountNumber, double balance) {
        AccoutName = accoutName;
        AccountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccoutName() {
        return AccoutName;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccoutName(String accoutName) {
        AccoutName = accoutName;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccout{" +
                "AccoutName='" + AccoutName + '\'' +
                ", AccountNumber='" + AccountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }


}
