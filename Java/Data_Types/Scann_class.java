package Data_Types;

import java.util.Scanner;



public class Scann_class {
    public static void main(String [] args){

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter You are Name:");
            String name = sc.nextLine();

            System.out.println("Hello, " + name  +  " Welcome to Java Development");
        }
    }
}
