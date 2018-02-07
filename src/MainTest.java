import junit.framework.TestCase;
import org.junit.Ignore;

import java.util.Random;

public class MainTest extends TestCase {
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

    @Ignore ("test ignore")
    public void testIgnored() {
        String message = "This is a new test";
        assertTrue(true);
    }

}
