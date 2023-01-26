public class Main {
    public static void main(String[] args) throws LimitException {

        BankAccount account = new BankAccount();
        account.deposit(20000);
        while (true){
            try {
                account.withDraw(6000);
            }catch (LimitException e){
                System.out.println("У вас счет на нуле: "+e.getRemainingAmount());
                account.withDraw(e.getRemainingAmount());
                break;
            }
        }

    }
}