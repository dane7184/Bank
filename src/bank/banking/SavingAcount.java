package bank.banking;

public class SavingAcount extends Acount {
    private Double interest;
    private Interest inter;

    public SavingAcount(){
        setInter(new Interest() {
            @Override
            public Double calculate(Double amount) {
                return amount*0.01;
            }
        });
    }
    public SavingAcount (Integer number, String name, Double balance){
        super(number,name,balance);
    }

    public void setInter(Interest inter){
        this.inter=inter;
    }

    public Double getInterest() {
        return interest;
    }
    public void calculateInterrest(){
        interest = inter.calculate(getBalance());
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    @Override
    protected void showBalane() {
        System.out.println("Acount Saving Money");
        System.out.println("Acount Name : "+getName());
        System.out.println("Acount Number : "+ getNumber());
        System.out.println(" Balacne : "+getBalance());
        System.out.println("Interest : "+ interest);
    }
}
