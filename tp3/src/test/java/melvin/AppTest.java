package melvin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Test si le App.main() retourne "Hello World!"
     */
    @Test
    public void testHelloWorld(){
        assertEquals("Hello World !", App.main());
    }
}
