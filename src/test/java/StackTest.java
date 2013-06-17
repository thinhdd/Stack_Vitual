import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 6/17/13
 * Time: 1:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class StackTest {

    @Test
    public void openStack()
    {
        Mystack stack = new Mystack();
        assertEquals(0, stack.size());
    }
    @Test
    public void addElement()
    {
        Mystack stack = new Mystack();
        stack.add("adb");
        assertEquals(1, stack.size());
    }
    @Test
    public void addAndCheckSize()
    {
        Mystack stack = new Mystack();
        stack.add("adb");
        assertEquals(1, stack.size());
        stack.add("asc");
        assertEquals(2, stack.size());
    }
    @Test
    public void checkTopStackEmpty()
    {
        Mystack stack = new Mystack();
        assertEquals(null, stack.top());
    }
    @Test
    public void getTopValue()
    {
        Mystack stack = new Mystack();
        stack.add("adb");
        assertEquals("adb", stack.top());
    }
    @Rule
    public ExpectedException ex = ExpectedException.none();
    @Test
    public void getPopException()
    {
        Mystack stack = new Mystack();
        ex.expectMessage("StackEmptyException");

        stack.pop();
    }
}
