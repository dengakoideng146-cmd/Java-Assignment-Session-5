package Basiclooping.intermediatelooping.nestedloops.Analyticalandcomplexproblems.ArraySample.Array;
import java.util.Scanner;
public class atmsimulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 100000;
        int[] transactions = new int[5];

        double totalDeposited = 0;
        double totalWithdrawn = 0;
        int count = 0;

        while (count < 5) {
            System.out.println("\n1. Deposit");
            System.out.println("2. withdraw");
            System.out.print("choose transaction: ");
            int choice = input.nextInt();

            System.out.print("Enter amount:");
            int amount = input.nextInt();

            if(amount <= 0) {
                System.out.println("Invalid amount. Enter a positive number.");
                continue;
            }
            // 2, 3, and 4. process transaction and update balance 
            if(choice == 1) {
                transactions[count] = amount;
                balance += amount;
                totalDeposited += amount;
                count++;

                System.out.println("Deposit successful.");
            } else if (choice == 2) {
                if(amount > balance) {
                    System.out.println("Insufficient balance. Withdrawal rejected.");
                    continue;
                }
                transactions[count] = -amount;
                balance -= amount;
                count++;

                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Invalid transaction choice.");
            }
        }
        // Display final balance and transaction totals
        System.out.println("\nFinal balance: Rp" + balance);
        System.out.println("Total deposited: Rp" + totalDeposited);
        System.out.println("Total withdrawn: Rp" + totalWithdrawn);

        System.out.println("\nTransaction history:");
        for(int i = 0; i < count; i++) {
            System.out.println(transactions[i]);
        }
        input.close();
    }
}
    

    




    

    





                    

            
        
    

