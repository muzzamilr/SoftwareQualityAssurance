import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class testCase1 {

    public static Boolean palindromeCheck(String original) {
        String reverse = "";   
            int length = original.length();   
            for ( int i = length - 1; i >= 0; i-- )  
               reverse = reverse + original.charAt(i);  
            if (original.equals(reverse))  
               return true;  
            else  
               return false;   
         
    }

    @Test
    public void testcase1(){
        System.out.println("Test case 1");
        
        assertEquals(true, palindromeCheck("wow"));
    }

}