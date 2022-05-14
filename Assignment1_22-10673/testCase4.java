import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class testCase4 {

    public static int modulo(int a, int b) { 
        // Mod
        int k = a % b;
        return k;
    }

    @Test
    public void testcase1(){
        System.out.println("Test case 1");
        
        assertEquals(0, modulo(10, 5));
    }

}