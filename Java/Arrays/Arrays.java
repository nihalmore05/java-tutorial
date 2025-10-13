package Arrays;
public class Arrays {
    
    private static void processingArray(){           // void kadun static takav lagel static function non static call hot nahi
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element:" + numbers[2]);


        System.out.println("All elements:");
        for (int i = 0; i <numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
    //     Arrays obj = new Arrays();               //Array pass like a object
    //    obj.processingArray();    
       
      Arrays.processingArray();
      //    processingArray();

    }
    
}
