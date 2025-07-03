package Controll_Flow;

public class switch_example {
    public static void main(String[] args){
        
    //     int day = 4;
        
    //     switch(day){

    //         case 1:
    //           System.out.println("Monday");
    //           break;
    //         case 2:
    //           System.out.println("Tuesday");
    //           break;
    //         case 3:
    //           System.out.println("Wednesday");
    //           break;
    //         case 4:
    //           System.out.println("Thursday");
    //           break;
    //         case 5:
    //           System.out.println("Friday");
    //           break;     
    //         case 6:
    //           System.out.println("Saturday");
    //           break; 
    //         case 7:
    //           System.out.println("Sunday");
    //           break;   

    //         default:
    //            System.out.println("Invalid Day");  
    //     }
    // }
    
    // ------------------ without Break statement   ---------------------   
      //   String day ="Tuseday";
      //   switch (day){
      //       case "Monday" :
      //       System.out.println("Day 1");

      //       case "Tuseday" :
      //       System.out.println("Day 2");

      //       case "Wenseday" :
      //       System.out.println("Day3");

      //       case "default" :
      //       System.out.println("Invalid Day");

      //   }
      // }

      // -------------------Continue---------------------------

        for( int i = 1; i <=5; i++){
          
          if( i == 3){
            System.out.println("skipping number:"  + i);
            continue; // Skip the rest of the code in this iteration
          }
          System.out.println("Number: "  + i);
        }
      
    }
   
                
  }