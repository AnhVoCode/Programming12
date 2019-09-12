import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


public class ProblemsTest {
    Problems testProblems;

    @Before
    public void setUp(){
        testProblems = new Problems();
    }

    @Test
    //If all parameters equal zero then x is all real numbers
    public void testIfAllParameterEqualZero(){
        testProblems.linearEquation(0,0,0);
        assertTrue("Infinity solution",testProblems.x == Double.POSITIVE_INFINITY || testProblems.x == Double.NEGATIVE_INFINITY);

    }

    //If only a = 0, then x is undefined
    @Test
    public void testIFaEqualsZero(){
        testProblems.linearEquation(0,2,4);
        assertTrue("No solution",testProblems.x == );
    }


}
