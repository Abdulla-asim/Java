public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(50000);
        SavingsAccount saver2 = new SavingsAccount(67000.00);

        SavingsAccount.modifyInterestRate(0.10);
        System.out.println("\nSaver 1's balance with 10% interest: " + saver1.getSavingsBalance());
        System.out.println("Saver 2's balance with 10% interest: " + saver2.getSavingsBalance());

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("\nSaver 1's balance with 10% interest after 1 month: " + saver1.getSavingsBalance());
        System.out.println("Saver 2's balance with 10% interest after 1 month: " + saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("\nSaver 1's balance with 5% interest after 1 month: " + saver1.getSavingsBalance());
        System.out.println("Saver 2's balance with 5% interest after 1 month: " + saver2.getSavingsBalance());
    }
}
