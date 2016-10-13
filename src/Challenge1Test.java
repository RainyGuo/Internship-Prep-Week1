import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Siraj on 10/12/16.
 */
public class Challenge1Test {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void duplicateDeleter() throws Exception {
        Challenge1 test = new Challenge1();
        int[] testArr = {2, 3, 5, 5, 7, 11, 11, 11, 11, 13};
        int count = test.duplicateDeleter(testArr);
        int[] correct = {2, 3, 5, 7, 11, 13, 0, 0, 0, 0};
        System.out.println(count);
        assertTrue("Incorrect number of elements", count == 6);
        assertTrue("Incorrect array", Arrays.equals(correct, testArr));
    }

}