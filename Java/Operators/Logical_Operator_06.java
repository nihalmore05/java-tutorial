package Operators;
public class Logical_Operator_06 {
    public static void main(String[] args) {
        int age = 21;
        // boolean hasLicense = true;

        // Logical AND used hear (&&)

        // if (age > 18 && hasLicense) {
        //     System.out.println("You are eligible to drive."); // This will print
        // } else {
        //     System.out.println("You are not eligible to drive.");
        // }


        //  Ternary Operator ( ? , :)
        
        String Result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(Result);
    }
}
    

    


