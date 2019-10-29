import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Partitioning inputs :
 * start = 0,
 * start <0,
 * start = text.length(,
 * start > text.length(),
 * text = null
 */
public class StringReverseTest {

    /**
     * Test if start == 0
     */
    @Test
    public void startZero(){
        List<String> expected = new ArrayList<>();
        expected.add("dlrow ,olleh");
        assertThat(StringReverse.reverseEnd("Hello, world",0),is(expected));
    }

    /**
     * Test if start<0
     */
    @Test
    public void startLessThanZero(){
        List<String> expected = new ArrayList<>();
        expected.add("Start at 0 or greater ");
        assertThat(StringReverse.reverseEnd("Hello, world",-1),is(expected));
    }

    /**
     * Test if start == text.length()
     */
    @Test
    public void startTextLength(){
        List<String> expected = new ArrayList<>();
        expected.add("Hello, world");
        assertThat(StringReverse.reverseEnd("Hello, world",11), is(expected));
    }

    /**
     * Test if start > text.length()
     */
    @Test
    public void startGreaterThanTextLength(){
        List<String> expected = new ArrayList<>();
        expected.add(" Start number must be less than or equal to length of the text");
        assertThat(StringReverse.reverseEnd("Hello, world", 12), is(expected));
    }

    /**
     * Test if text is null
     */
    @Test
    public void nullText(){
        List<String> expected = new ArrayList<>();
        expected.add("Text must not be null");
        assertThat(StringReverse.reverseEnd("",2), is(expected));
    }
}