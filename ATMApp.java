import java.util.Scanner;

// BankAccount class that handles user account operations
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            displayProgress("Depositing", amount);
            System.out.println("\n╔════════════════════════════════════╗");
            System.out.println("   Success! ₹" + amount + " has been added to your account.");
            System.out.println("╚════════════════════════════════════╝");
        } else {
            System.out.println("\n╔════════════════════════════════════╗");
            System.out.println("   Oops! Deposit amount must be greater than ₹0.");
            System.out.println("╚════════════════════════════════════╝");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            displayProgress("Withdrawing", amount);
            balance -= amount;
            System.out.println("\n╔════════════════════════════════════╗");
            System.out.println("   Success! ₹" + amount + " has been withdrawn from your account.");
            System.out.println("╚════════════════════════════════════╝");
        } else if (amount > balance) {
            System.out.println("\n╔════════════════════════════════════╗");
            System.out.println("   Insufficient balance! You only have ₹" + balance + " available.");
            System.out.println("╚════════════════════════════════════╝");
        } else {
            System.out.println("\n╔════════════════════════════════════╗");
            System.out.println("   Withdrawal amount must be greater than ₹0.");
            System.out.println("╚════════════════════════════════════╝");
        }
    }

    public void checkBalance() {
        System.out.println("\n╔════════════════════════════════════╗");
        System.out.println("   Your current balance is ₹" + balance);
        System.out.println("╚════════════════════════════════════╝");
    }

    // Simulates a progress bar for depositing or withdrawing
    private void displayProgress(String action, double amount) {
        System.out.println("\n" + action + " ₹" + amount + "...");
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(100); // Simulate progress time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.print("█");
        }
        System.out.println();
    }
}

// ATM class for handling ATM functionalities
class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    // Display the main menu options
    public void displayMenu() {
        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("   Welcome to your Virtual ATM");
        System.out.println("   Please select an option:");
        System.out.println("   1. 💰 Check Balance");
        System.out.println("   2. 📥 Deposit");
        System.out.println("   3. 📤 Withdraw");
        System.out.println("   4. 🚪 Exit");
        System.out.println("╚════════════════════════════════════════════╝");
    }

    // Handle user-selected option
    public void handleOption(int option) {
        Scanner scanner = new Scanner(System.in);
        switch (option) {
            case 1:
                account.checkBalance();
                break;
            case 2:
                System.out.print("   Enter the amount to deposit: ₹");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                break;
            case 3:
                System.out.print("   Enter the amount to withdraw: ₹");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
                break;
            case 4:
                System.out.println("\n╔══════════════════════════════════════════╗");
                System.out.println("   Thank you for using our ATM. Have a great day!");
                System.out.println("   🌟 Logging you out...");
                displayExitAnimation();
                System.out.println("╚══════════════════════════════════════════╝");
                System.exit(0);
                break;
            default:
                System.out.println("\n╔════════════════════════════════════╗");
                System.out.println("   ⚠ Invalid option. Please try again.");
                System.out.println("╚════════════════════════════════════╝");
        }
    }

    // Exit animation with stars
    private void displayExitAnimation() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(500); // Simulate exit animation time
                System.out.print("✨ ");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    // Run the ATM interface in a loop until the user exits
    public void runATM() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("   Please select an option: ");
            int option = scanner.nextInt();
            handleOption(option);
            System.out.println();
        }
    }
}

// Main class to run the ATM program
public class ATMApp {
    public static void main(String[] args) {
        // Initial balance for the account
        BankAccount userAccount = new BankAccount(10000.0); // Initial balance: ₹10,000
        ATM atm = new ATM(userAccount);

        // Start ATM interface
        atm.runATM();
    }
}
