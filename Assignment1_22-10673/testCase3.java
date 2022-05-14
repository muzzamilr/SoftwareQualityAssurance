import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class testCase3 {

    public static double mean(double num1, double num2) {

    // declare sum variable
    // and initialize with 0
    double sum = 0.0;
    // declare average variable
    double avg = 0.0;

    // calculate the sum value
    sum = num1 + num2;
    // calculate the average value
    avg = sum/2;
    return avg;
    }

    @Test
    public void testcase1(){
        System.out.println("Test case 1");
        
        assertEquals(7.5, mean(5, 10));
    }

}