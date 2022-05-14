import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class testCase2 {

    public static int factorial(int num) {
        int factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        return factorial;
    }

    @Test
    public void testcase1(){
        System.out.println("Test case 1");
        
        assertEquals(120, factorial(5));
    }

}