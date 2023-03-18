package bank.myBank;

public class BankDemo {
    public static void main(String[] args) {
        Bank bank1 = new Bank();

        BankAcount acc1 = new BankAcount("001", "Dane", 200d);
        BankAcount acc2 = new BankAcount("002", "SreyNich", 100d);
        BankAcount acc3 = new BankAcount("003", "BengHout", 500d);

        bank1.openAcount(acc1);
        bank1.openAcount(acc2);

        // System.out.println(bank1.getBankAcounts());

        for (BankAcount acc : bank1.getBankAcounts()) {
            System.out.println(acc.toString());
        }

        bank1.deposite("001", 50);
        System.out.println("After Deposite ");

//	for(bank.me.BankAcount acc : bank1.getBankAcounts()) {
//		System.out.println(acc.toString());
//	}
        bank1.displayAllAcount();
        // withdraw
        bank1.Withdraw("002", 50);
        System.out.println("After Thida withdraw ");
        bank1.displayAllAcount();
        // Transter
        bank1.transter("001", "002", 100);
        System.out.println("After Traster money");
        bank1.displayAllAcount();
    }
}
