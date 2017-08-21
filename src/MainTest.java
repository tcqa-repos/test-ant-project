import junit.framework.TestCase;

import java.util.Random;

public class MainTest extends TestCase {
    public void testSuccess() throws Exception {
        assertTrue(true);
    }

    public void testRandom() throws Exception {
        boolean value = new Random().nextBoolean();
        assertTrue(value);
    }
}
