import java.util.Arrays;

/**
 * Created by szane on 10/25/2016.
 */
public class Challenge3 {

     public static void main(String args[]) {
         Challenge3 test = new Challenge3();
         int[][] matrix = {
                 {1, 2, 3 ,4},
                 {5, 6, 7, 8},
                 {9, 10, 11, 12},
                 {13, 14, 15, 16}
         };
         System.out.println(Arrays.toString(test.spiral(matrix)));
     }

     public int[] spiral(int[][] arr) {
        int ordered[] = new int[arr.length * arr[0].length];

        int counter = 0;
        if (arr == null || arr.length == 0) {
            return ordered;
        }

        int rows = arr.length;
        int columns = arr[0].length;

        int x = 0;
        int y = 0;

        while (rows > 0 && columns > 0) {
            if (rows == 1) {
                for (int loop = 0; loop < columns; loop++) {
                    ordered[counter++] = arr[x][y++];
                }
                break;
            } else if (columns == 1) {
                for (int loop = 0; loop < rows; loop++) {
                    ordered[loop++] = arr[x++][y];
                }
                break;
            }

            for (int loop = 0; loop < columns - 1; loop++) {
                ordered[counter++] = arr[x][y++];
            }

            for (int loop = 0; loop < rows - 1; loop++) {
                ordered[counter++] = arr[x++][y];
            }

            for (int loop = 0; loop < columns - 1; loop++) {
                ordered[counter++] = arr[x][y--];
            }

            for (int loop = 0; loop < rows - 1; loop++) {
                ordered[counter++] = arr[x--][y];
            }




            x++;
            y++;
            rows -= 2;
            columns -= 2;


        }

        return ordered;

    }
}
