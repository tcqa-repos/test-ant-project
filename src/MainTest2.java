import junit.framework.TestCase;

import java.util.Random;

public class MainTest2 extends TestCase {
    public void testSuccess() throws Exception {
        byte two = 2;
        assertTrue(true);
    }

    public void testRandom() throws Exception {
        boolean value = new Random().nextBoolean();
        assertTrue(value);
    }

    public void testNew() throws Exception {
        String message = "This is a new test";
        assertTrue(true);
    }
}
