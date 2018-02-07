import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.AssertJUnit.assertTrue;

public class MainTestNG {

    @Test
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
