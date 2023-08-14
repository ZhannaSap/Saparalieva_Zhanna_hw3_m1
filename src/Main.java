public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(15000);
        while (true) {
            try {
                System.out.println("У вас на счету: " + bankAccount.getAmount());
                bankAccount.withDraw(6000);
                System.out.println("Деньги успешно сняты со счёта. У вас на счету осталось: " + bankAccount.getAmount());
            } catch (LimitExeption e) {
                System.out.println(e.getMessage());
                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());
                }catch (LimitExeption ae){
                    throw new RuntimeException(ae);
                }
                System.out.println("У вас на счету: " + bankAccount.getAmount());
                break;
            }

        }
    }
}