package melvin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

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

    /**
     * Test si le App.echo(param) renvoie bien param
     */
    @Test
    public void testEcho(){
        ArrayList monObjet = new ArrayList<String>();
        assertEquals(monObjet, App.echo(monObjet));
    }
}
