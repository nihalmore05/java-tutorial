package Loops.Nested_Loop;

// The nested  loop is the loop in side another loop


/*Q ) Print following pattern 

   *
   **
   ***
   ****
   *****
   ******
*/

public class Example1 {
    public static void main(String[] args){


        for(int i = 0; i < 6; i++){                    //   outer loop this is fist loop
            for (int j = 0; j <= i; j++){              //   inner loop  this is second loop depends on first loop
                System.out.print("*");

            }
            System.out.println();
        }
        
    }
    
}
