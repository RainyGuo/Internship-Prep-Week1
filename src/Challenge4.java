/**
 * Created by Siraj on 10/25/2016.
 */
public class Challenge4 {
    public boolean palindromeDetector(String text) {
        String cleaned = text.replaceAll("[^A-Za-z0-9]", "");

        int fromStart = 0;
        int fromEnd = text.length() - 1;

        while (fromEnd > fromStart) {
            if (text.charAt(fromStart) != text.charAt(fromEnd)) {
                return false;
            }

            fromStart++;
            fromEnd--;
        }
        return true;
    }
}
