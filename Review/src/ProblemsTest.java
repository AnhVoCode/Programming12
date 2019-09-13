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
        assertTrue("Infinity solution",testProblems.a ==0 && testProblems.b ==0 && testProblems.c==0);

    }

    //If only a = 0, then x is undefined
    @Test
    public void testIFaEqualsZero(){
        testProblems.linearEquation(0,0,0);
        assertTrue("No solution",testProblems.a ==0);

    }

    @Test
    //If a is not equal 0, then x = (c-b)/a
    public void testIfaNotEqualZero(){
        testProblems.linearEquation(2,3,4);
        assertTrue(testProblems.a>0);
        assertEquals((testProblems.c-testProblems.b)/testProblems.a,testProblems.x,0);
    }

    @Test
    //If d<0, then there would be no real roots
    public void testIfDiscriminantLessThan0(){
        testProblems.quadraticEquation(2,1,3,1);
        assertTrue("No solution", testProblems.d<0);
    }

    @Test
    //If d=0, then there would be two same real roots
    public void testIfDiscriminantEqual0(){
        testProblems.quadraticEquation(1,4,5,1);
        assertEquals(-testProblems.b/(2*testProblems.a),testProblems.x1,0);
        assertTrue(testProblems.x2 == testProblems.x1);
    }

    @Test
    //If d>0, then there would be two different real roots
    public void testIfDiscriminantGreatThan0(){
        testProblems.quadraticEquation(1,9,3,1);
        assertEquals(-testProblems.b+Math.sqrt(testProblems.d),testProblems.x1,0);
        assertEquals(-testProblems.b-Math.sqrt(testProblems.d),testProblems.x2,0);
    }

    @Test
    //Test the absolute value of the difference between the number and root*root*root
    public void testAbsoluteValueOfDiff(){
        testProblems.diff(8,2);
        assertTrue(testProblems.diff>=0);
        testProblems.diff(8,2.1);
        assertTrue(testProblems.diff>=0);
    }



    @Test
    //If n is negative, then cube root returned should be negative too
    public void testIfNegative(){
        testProblems.cubeRoot(-3);
        assertTrue(testProblems.diff<=0.0000001);
        assertTrue(testProblems.root<0);
    }

}
