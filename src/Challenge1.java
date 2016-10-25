import java.util.Arrays;

/**
 * Created by Siraj on 10/12/16.
 */
public class Challenge1 {

    public static void main(String[] args) {



    }

    public int duplicateDeleter(int[] arr) {
        if (arr.length <= 1 || arr == null) {
            return arr.length;
        }
        int currentSpot = 0;
        int temp;
        for (int looper = 0; looper < arr.length; looper++) {
            if (arr[looper] > arr[currentSpot]) {
                currentSpot++;
                temp = arr[looper];
                arr[looper] = 0;
                arr[currentSpot] = temp;

            } else if (looper != currentSpot){
                arr[looper] = 0;
            }

        }
        return currentSpot + 1;
    }
}

