package Arrays.One_Dimensional;

// print 1D array lenght using for loop
public class example_2 {
    static int[] a = { 100, 200, 300, 400, 500, 1000, 2000 };    // veriable define kele ahe

    public static void lenghtArray() { // creating "lenghtArray" function
        // int[] a = { 100, 200, 300, 400, 500, 1000, 2000 };

        for (int i = 0; i < a.length; i++) { // writing a logic hera
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {

        lenghtArray(); // function call hear

    }
}
