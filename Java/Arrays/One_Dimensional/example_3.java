package Arrays.One_Dimensional;

//Q)Create an array of strings containing names. Print all names in the array using a traditional for-each loop.

public class example_3 {
    
    static String[] CarsName = {"BMW", "AUDI", "TATA", "HONDA"};
    private static void StringArray(){
        
        System.out.println("My fevourite Cars:");
        // using for-each loop 
        for(String str: CarsName){                 // String elements aslay mule "Str" ghet le ahe loop madhi      
           System.out.println(str);               
        }

    }
    public static void main(String[] args)
    {
       example_3.StringArray();                 //class name se hum mining full bana saktey
    }

}
