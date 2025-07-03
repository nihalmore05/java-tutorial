package Controll_Flow;

public class calculator {

    public static void performArthimeticOperation(String operationName, int num1, int num2){
        if(operationName == "Sum") {
            addNumbers(num1, num2);
        } else if (operationName == "Multiply") {
            multiplyNumbers(num1, num2);
        } else {
            System.out.println("Not a valid operation");
        }
    }

    public static int addNumbers(int num1, int num2){
        int result = num1 + num2;
        System.out.println("Result: "  + result);
        return result;
    }

    public static int multiplyNumbers(int num1, int num2){
        int result = num1 * num2;
        System.out.println("Result: "  + result);
        return result;
    }

public static void main(String[] args){
    // addNumbers(5,3);
    performArthimeticOperation("Name",2 , 3);
    performArthimeticOperation("Sum",2 , 3);
    performArthimeticOperation("Multiply",2 , 3);

    // System.out.println("Result: "  + result);
}

}
    
