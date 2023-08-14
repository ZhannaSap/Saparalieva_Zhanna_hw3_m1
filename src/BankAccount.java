public class BankAccount {
    private double amount;


    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount += sum;
    }

    public void withDraw(int sum) throws LimitExeption {
        if (sum>amount){
            throw new LimitExeption("Сумма снимаемых денег"
                    + " превышает оставшуюся сумму. ", this.amount);
        }
        amount -= sum;
    }
}
