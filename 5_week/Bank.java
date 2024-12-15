
import java.util.Scanner;

abstract class Account {
    String name;
    int accno;
    String acc_type;
    double balance;

    Account(String name, int accno, String acc_type, double balance) {
        this.name = name;
        this.accno = accno;
        this.acc_type = acc_type;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Balance = " + balance);
    }

    void showBalance() {
        System.out.println("Balance = " + balance);
    }

    abstract void computeInterest();

    abstract void withdraw(double amount);
}

class SavAcc extends Account {
    final double interestRate = 0.04;

    SavAcc(String name, int accno, double balance) {
        super(name, accno, "Savings", balance);
    }

    void computeInterest() {
        double interest = this.balance * interestRate;
        this.balance += interest;
        System.out.println("Interest added. New balance = " + this.balance);
    }

    void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient Balance");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount + "\nCurrent balance: " + this.balance);
        }
    }
}

class CurAcc extends Account {
    double minAmount = 1000;
    double penalty = 100;
    double[] chequeHistory = new double[100];
    int chequeCount = 0;

    CurAcc(String name, int accno, double balance) {
        super(name, accno, "Current", balance);
    }

    void computeInterest() {
        System.out.println("Interest is not applicable for current accounts.");
    }

    void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount + "\nCurrent balance: " + this.balance);
            if (balance < minAmount) {
                balance -= penalty;
                System.out.println("Penalty applied. New balance: " + balance);
            }
            chequeHistory[chequeCount++] = amount;
        }
    }

    void displayHistory() {
        System.out.println("Transaction history:");
        for (int i = 0; i < chequeCount; i++) {
            System.out.println("Amount withdrawn: " + chequeHistory[i]);
        }
        System.out.println("End of transactions.");
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of accounts needed:");
        int accountNos = input.nextInt();
        Account[] accounts = new Account[accountNos];

        for (int i = 0; i < accountNos; i++) {
            System.out.println("Enter:\n1 for Savings\n2 for Current Account");
            int t = input.nextInt();
            input.nextLine();

            System.out.println("Enter your name:");
            String name = input.nextLine();
            System.out.println("Enter your initial balance:");
            double balance = input.nextDouble();
            int accno = i;

            if (t == 1) {
                accounts[i] = new SavAcc(name, accno, balance);
            } else {
                accounts[i] = new CurAcc(name, accno, balance);
            }

            boolean running = true;
            while (running) {
                System.out.println("a: Deposit\nb: Show Balance\nc: Compute Interest\nd: Withdraw\nq: Quit");
                char choice = input.next().charAt(0);

                switch (choice) {
                    case 'a':
                        System.out.println("Enter amount to deposit:");
                        double depositAmount = input.nextDouble();
                        accounts[i].deposit(depositAmount);
                        break;
                    case 'b':
                        accounts[i].showBalance();
                        break;
                    case 'c':
                        accounts[i].computeInterest();
                        break;
                    case 'd':
                        System.out.println("Enter amount to withdraw:");
                        double withdrawAmount = input.nextDouble();
                        accounts[i].withdraw(withdrawAmount);
                        break;
                    case 'q':
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }
        input.close();
    }
}
