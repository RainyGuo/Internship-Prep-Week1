/**
 * Created by Siraj on 10/25/2016.
 */
public class Challenge4 {
    public static void main(String args[]) {
        Challenge4 test = new Challenge4();
        System.out.println(test.palindromeDetector("race a car"));
    }

    public boolean palindromeDetector(String text) {
        String cleaned = text.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int fromStart = 0;
        int fromEnd = cleaned.length() - 1;

        while (fromEnd > fromStart) {
            if (cleaned.charAt(fromStart) != cleaned.charAt(fromEnd)) {
                return false;
            }

            fromStart++;
            fromEnd--;
        }
        return true;
    }
}
