import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

    private Stack s;

    @Before
    public void setup(){
        s = new Stack();
        s.push(1);
        System.out.println("this is setup");
    }

    @After
    public void teardown(){
        System.out.println("this is teardown");
    }

    @Test
    public void testPush(){
        s.push(1);
        assertEquals(2, s.size());
    }

    @Test
    public void testNonEmpty(){
        assertEquals(1,s.size());
    }
}
