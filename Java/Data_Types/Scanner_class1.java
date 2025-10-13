package Data_Types;

import java.util.Scanner;

public class Scanner_class1 {

    public static void Scannerfunc(Scanner sc) {

        System.out.println("Enter You are Name:");
        String name = sc.nextLine();

        System.out.println("Hello, " + name + " Welcome to Java Development");
    }

    

    public static void Scannerfunc1(Scanner sc) {
        
            System.out.println("Enter You are Age:");
            String number = sc.nextLine();

            System.out.println("You are age is "  + number);
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Scannerfunc(sc);
        Scannerfunc1(sc);

        sc.close();

    }
}
