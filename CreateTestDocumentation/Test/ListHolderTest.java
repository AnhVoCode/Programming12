
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.List;

import static org.junit.Assert.*;

public class ListHolderTest {
    /**Test Strategy:
     * ListsOfList.size < 2; >=2
     * Combining the first two lists
     * Remove the second list
     */


    /**
     * Cover: ListsOfLists.size <2
     */
    @Test
    public void sizeLessThanTwo() {
        ListHolder lists = new ListHolder();
        assertEquals(null, lists.listOfLists.size() < 2);
    }
}