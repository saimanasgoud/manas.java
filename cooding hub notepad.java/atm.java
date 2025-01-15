import java.util.Scanner;

public class restaurants{
	public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int balance = 0; 
        int choice;
        int amount;

        System.out.println("----WELCOME TO STATE BANK OF INDIA----");

        do {
            System.out.println("\nChoose an option to continue:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: " + balance);
                    break;

                case 2: 
                    System.out.print("Enter the amount to withdraw: ");
                    amount = sc.nextInt();

                    if (amount <= balance && amount > 0) {
                        balance -= amount;
                        System.out.println("You have successfully withdrawn " + amount);
                        System.out.println("Remaining balance: " + balance);
                    } else {
                        System.out.println("Insufficient balance/funds !");
                    }
                    break;

                case 3: 
                    System.out.print("Enter the amount to deposit: ");
                    amount = sc.nextInt();

                    if (amount > 0) {
                        balance += amount;
                        System.out.println("\nYou have successfully deposited " + amount);
                        System.out.println("\nUpdated balance: " + balance);
                    } else {
                        System.out.println("\nInvalid deposit amount!");
                    }
                    break;

                case 4: 
                    System.out.println("\nThank you for using the ATM. Have a great day!");
                    break;

                default: 
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 4); 
    }
}
