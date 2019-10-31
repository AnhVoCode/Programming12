import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Testing Strategy:
 * Partition the inputs as follows:
 * text.length() : 0, >1
 * start         : 0, 1<start<text.length(), text.length(), >text.length()
 * text.length()-start: 0, 1, even > 1, odd>1
 *
 * Include even and odd-length reversal because only odd has a middle element that doesn't move
 */
public class StringReverseTest {
    /**
     * Cover: text.length() =0,
     *        start = 0
     *        text.length() - start = 0
     */
    @Test
    public void nullText(){
        assertEquals("", StringReverse.reverseEnd("",0));
    }

    /**
     * Cover: text.length() =1,
     *        start = 0;
     *        text.length() - start = 1;
     */
    @Test
    public void textLengthEqualsOne(){
        String expected = "H";
        assertEquals(expected,StringReverse.reverseEnd("H",0));
    }

    /**
     * Cover: text.length>1,
     *        1 < start < text.length()
     *        text.length() - start = (odd>1)
     */
    @Test
    public void reverseEnd(){
        String expected = "Hellodlrow ,";
        assertEquals(expected,StringReverse.reverseEnd("Hello, world",5));
    }
    /**
     * Test if start == 0
     */
    @Test
    public void startZero(){
        String expected = "dlrow ,olleH";
        assertEquals(expected,StringReverse.reverseEnd("Hello, world",0));
    }

    /**
     * Test if start<0
     */
    @Test
    public void startLessThanZero(){
        String expected = "Start at 0 or greater";
        assertEquals(expected,StringReverse.reverseEnd("Hello, world",-1));
    }

    /**
     * Test if start == text.length()
     */
    @Test
    public void startTextLength(){
        String expected = "Hello, world";
        assertEquals(expected, StringReverse.reverseEnd("Hello, world",12));
    }

    /**
     * Test if start > text.length()
     */
    @Test
    public void startGreaterThanTextLength(){
        String expected =  "Start number must be less than or equal to length of the text";
        assertEquals(expected,StringReverse.reverseEnd("Hello, world",13));
    }


}