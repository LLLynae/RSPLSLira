/**
 *Lauren Lira - lllira1048
 *CIT 4423 01
 *Sept 18,2022
 *Windows 11
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class MainTest {

    @Test
    public void MainTest() {

        String testthisString = "rock";
        assertEquals(true, Main.winCheck(testthisString, 1));
        assertEquals(true, Main.winCheck(testthisString, 4));
        assertEquals(false, Main.winCheck(testthisString, 2));
        assertEquals(false, Main.winCheck(testthisString, 3));
        assertEquals(false, Main.winCheck(testthisString, 5));

        String testthisString2 = "paper";
        assertEquals(true, Main.winCheck(testthisString2, 2));
        assertEquals(true, Main.winCheck(testthisString2, 5));
        assertEquals(false, Main.winCheck(testthisString2, 1));
        assertEquals(false, Main.winCheck(testthisString2, 3));
        assertEquals(false, Main.winCheck(testthisString2, 4));

        String testthisString3 = "scissors";
        assertEquals(true, Main.winCheck(testthisString3, 3));
        assertEquals(true, Main.winCheck(testthisString3, 4));
        assertEquals(false, Main.winCheck(testthisString3, 1));
        assertEquals(false, Main.winCheck(testthisString3, 2));
        assertEquals(false, Main.winCheck(testthisString3, 5));

        String testthisString4 = "lizard";
        assertEquals(true, Main.winCheck(testthisString4, 3));
        assertEquals(true, Main.winCheck(testthisString4, 2));
        assertEquals(false, Main.winCheck(testthisString4, 1));
        assertEquals(false, Main.winCheck(testthisString4, 4));
        assertEquals(false, Main.winCheck(testthisString4, 5));

        String testthisString5 = "spock";
        assertEquals(true, Main.winCheck(testthisString5, 1));
        assertEquals(true, Main.winCheck(testthisString5, 5));
        assertEquals(false, Main.winCheck(testthisString5, 2));
        assertEquals(false, Main.winCheck(testthisString5, 3));
        assertEquals(false, Main.winCheck(testthisString5, 4));
        
    }//end of test  constructor, checks booleans

}//end test class
