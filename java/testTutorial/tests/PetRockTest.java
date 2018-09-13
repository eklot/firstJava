import org.junit.*;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class PetRockTest {
    private  PetRock rock;


    // timeout rule :
   // @Rule
   // public Timeout globalTimeout = Timeout.seconds(100);


    //@BeforeClass // виконується лише раз
    //@After // ..
    @Before // виеонується при виконнаі кожної функції
    public void myTestSetUp()
    {
        rock = new PetRock("Rocky");
    }
    @Test
    public void getName(){

        assertEquals("Rocky",rock.getName());
    }

    @Test
    public void testUnhappyToStart(){

        assertFalse(rock.isHappy());
    }

    @Test
    public void testHappyAfterPlay()
    {
        rock.playWhithRock();
        assertTrue(rock.isHappy());
    }

    @Ignore("Exception is not yet defined")
    @Test (expected = IllegalStateException.class)
    public void nameFail()
    {
        rock.getHappyMessage();
    }

    @Test
    public void name()
    {
        rock.playWhithRock();
        assertEquals("I'm happy!",rock.getHappyMessage());
    }


    @Test(timeout=100) // miliseconds to end
    public void waitTillHappyTest()
    {
        rock.waitTillHappy();
    }
}