package Loops.While_Loop_example;


// Print only odd numbers between 1 and 100 using

public class Odd_num {
    public static void main(String[] args){

        int num = 1;             //  we start from first odd number

        while( num <=100){              // kiti paryant loop chalway cha ahe ti number
            System.out.println(num);      // printing the current odd number

            num += 2;                    //Increment by 2 get the next odd number    (1 +2 = 3)
        }
    }
}
