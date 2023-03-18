package bank.banking;

public class RildRate implements Interest{
    @Override
    public Double calculate(Double amount) {
        return amount*0.09;
    }
}
