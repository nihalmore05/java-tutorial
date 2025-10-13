package Arrays.Multi_Dimensional;
//2D array using Jagged arey 
public class example2 {
    static int[][] a = { { 10, 20, 30, 40 }, { 50, 60, }, { 70, 80, 90 } };

    public static void TwoDArray() {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        example2.TwoDArray();
    }
}
