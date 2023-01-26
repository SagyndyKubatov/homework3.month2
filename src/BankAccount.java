public class BankAccount {
    private double amount;

    public BankAccount() {
        this.amount = 0.0;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount+=sum;
    }
    public void withDraw(int sum) throws LimitException {
        if (sum > amount){
            sum = (int) amount;
        }
        amount-=sum;
        System.out.println("Снято со счета: "+sum);
        if (amount == 0){
            throw new LimitException("У вас счет на нуле: ",amount);
        }
    }
}
