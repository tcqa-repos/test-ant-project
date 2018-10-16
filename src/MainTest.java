import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.AssertJUnit.assertTrue;

public class MainTest {

    @Test
    public void testSuccess() throws Exception {
        byte two = 2;
        assertTrue(true);
    }


    @Test
    public void testFail() throws Exception {
        byte two = 2;
        assertTrue(false)
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

}
