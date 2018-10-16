import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class MainTest {

    @Test
    public void testSuccess() throws Exception {
        byte two = 2;
        assertTrue(true);
    }

    @Test
    public void testRandom() throws Exception {
        boolean value = new Random().nextBoolean();
        assertTrue(value);
    }

    @Test
    public void testNew() throws Exception {
        String message = "This is a new test";
        assertTrue(true);
    }
	
	@Test
    public void testShouldFail() throws Exception {
        String message = "This is a failing test";
        assertTrue(false);
    }

    @Ignore ("test ignore")
    @Test
    public void ignoredTest() {
        String message = "This is a new test";
        assertTrue(true);
    }

}
