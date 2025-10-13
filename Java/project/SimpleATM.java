package project;

import java.util.Scanner;

public class SimpleATM {


    public static void main(String[] args) {
            
        BankATM();           // function    "we want to run Atm just call the function "

    }


      public static void BankATM(){
        // 1. Initialize variables
        double balance = 1000.00; // Starting balance
        boolean isRunning = true; // Controls the main loop
        Scanner scanner = new Scanner(System.in);

        // 2. Create the main loop that runs as long as isRunning is true
        while (isRunning) {
            // Display the menu
            System.out.println("\n--- Welcome to Simple ATM ---");
            System.out.println("1: Check Balance");
            System.out.println("2: Deposit Money");
            System.out.println("3: Withdraw Money");
            System.out.println("4: Exit");
            System.out.print("Please choose an option: ");

            int choice = scanner.nextInt();

            // 3. Use a switch statement to handle the user's choice
            switch (choice) {
                case 1:
                    //  Display the current balance

                    System.out.println("Your current balance is Rs " +balance);
                    break;



                case 2:
                    //  Ask for a deposit amount and add it to the balance
                    System.out.print("Enter amount deposit :");
                    Double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0){
                        balance += depositAmount;
                        System.out.println("Deposite succesfull New balance Rs. " +balance);
                    }else{
                        System.out.println("Invalid Amount");
                    }
                    break;



                        case 3:
    boolean validWithdraw = false; // जब तक सही input न मिले
    while (!validWithdraw) {
        System.out.print("Enter withdraw Amount: ");
        double withdrawAmount = scanner.nextDouble();

        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Amount withdrawn successfully! New Balance Rs " + balance);
            validWithdraw = true; // सही हुआ तो loop खत्म
        } else if (withdrawAmount > balance) {
            System.out.println("Insufficient balance.");
            validWithdraw = true; // balance से ज्यादा डाला तो भी loop खत्म और menu पर लौटेगा
        } else {
            // Negative या 0 amount case
            System.out.println("Invalid withdraw Amount!");
            System.out.println("*. Try again");
            System.out.println("#. Go back to Menu");
            System.out.print("Choose option: ");
            String option = scanner.next();

            if (option.equals("#")) {
                validWithdraw = true; // menu पर वापस जाने के लिए loop खत्म
            }
            // अगर option == 1 है तो loop फिर से चलेगा
        }
    }
    break;


                case 4:
                    //  Set isRunning to false to exit the loop and print a goodbye message

                    isRunning = false;

                    System.out.println("Thank You for using ATM  Visit Again");
                    break;



                default:
                    // Handle invalid menu options

                    System.out.println("Invaid Option Please Enter valid option ");
                    break;
            }
        }
        
        scanner.close(); // Good practice to close the scanner
    }
}
