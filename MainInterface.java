package sbsCode;
import java.util.Scanner;


public class MainInterface {

	public static void main(String[] args) {
		BankInterface bank = new BankInterface();
		Scanner scanner = new Scanner(System.in);
		while (true) {
            System.out.println("1. Create an account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Select an option:");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();
                System.out.print("Enter account holder's name: ");
                String accountHolder = scanner.next();
                System.out.print("Enter initial balance: ");
                int initialBalance = scanner.nextInt();

                BankAccount account = new BankAccount(accountNumber, accountHolder, initialBalance);
                bank.addAccount(account);
                System.out.println("Account created successfully.");
            } 
            else if (choice == 2) {
                System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();
                BankAccount account = bank.getAccount(accountNumber);
                if (account == null) {
                    System.out.println("Account not found.");
                } 
                else {
                    System.out.print("Enter deposit amount: ");
                    double amount = scanner.nextDouble();
                    account.deposit(amount);
                }
            } 
            else if (choice == 3) {
                System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();
                BankAccount account = bank.getAccount(accountNumber);
                if (account == null) {
                    System.out.println("Account not found.");
                } 
                else {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = scanner.nextDouble();
                    account.withdraw(amount);
                }
            } 
            else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            } 
            else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }
}

