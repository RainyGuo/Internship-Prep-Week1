
/**
 * Created by szane on 10/24/2016.
 */
public class Challenge2 {

    public int[] primeEnumerator(int n) {
        int primes[] = new int[n];
        int loop = 2;
        int counter = 0;
        while (loop <= 2) {
            if (isPrime(loop)) {
                primes[counter++] = loop;
            }

            loop++;
        }

        return primes;

    }

    public boolean isPrime(int value)
    {
        // Local variables
        boolean isPrime; // Holds flag telling if value is prime
        int factor; // Holds value that tests if it is a factor of the value
        int incrementer; // Holds value to increment the factor to continue the primality test

        // Initialize variables
        factor = 5;
        incrementer = 2;
        isPrime = true;

        // Perform calculations to check if value is prime
        if (value < 2) {
            isPrime = false;
        } else if (value == 2)
        {
            isPrime = true;
        }
        else if (value == 3)
        {
            isPrime = true;
        }
        else if (value % 2 == 0)
        {
            isPrime = false;
        }
        else if (value % 3 == 0)
        {
            isPrime = false;
        }
        else
        {
            while ((factor * factor) <= value)
            {
                if (value % factor ==  0)
                {
                    isPrime = false;
                }
                factor = factor + incrementer;
                incrementer = 6 - incrementer;
            }
        }

        // Return flag
        return isPrime;
    }
}
