import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankWithdrawalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account balance: ");
            double balance = Double.parseDouble(sc.next());

            System.out.print("Enter withdrawal amount: ");
            double amount = Double.parseDouble(sc.next());

            if (amount < 0) {
                throw new IllegalArgumentException(
                    "Withdrawal amount cannot be negative."
                );
            }

            if (amount > balance) {
                throw new InsufficientBalanceException(
                    "Insufficient balance."
                );
            }

            balance -= amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid numeric input.");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Bank transaction completed.");
        }
    }
}