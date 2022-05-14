import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class testCase5 {

    public static float percentage(float scored, float total_marks) { 
        float percentage;
        percentage = (float)((scored / total_marks) * 100);
        return percentage;
    }

    @Test
    public void testcase1(){
        System.out.println("Test case 1");
        
        assertEquals(10, percentage(10, 100));
    }

}