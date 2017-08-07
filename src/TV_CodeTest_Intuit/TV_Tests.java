package TV_CodeTest_Intuit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by B on 7/30/2017.
 */
public class TV_Tests {
    private Television tv;

    @Before //before each test
    public void b4Tests(){
        Map<String, String> temp = new HashMap<>();
        temp.put("56", "f");
        temp.put("68", "h");
        temp.put("70", "i");
        temp.put("46", "e");
        temp.put("1", "a");
        temp.put("2", "b");
        temp.put("3", "c");
        temp.put("45", "d");
        temp.put("57", "g");


        tv = new Television(temp);
    }

    @Test
    public void test1() {
        assertEquals("channel must be 'h' ", "h", tv.goToChannel("68"));
        assertEquals("Channel up is 'i'", "i", tv.channelUp());
    }

    @Test
    public void testInvalidChannel() {
        //assertEquals("Channel up is 'i'", "70", tv.channelUp());
    }

    @After
    public void printAfterTest(){ //print after each test
        System.out.println("This test suite has ended");
    }
}
