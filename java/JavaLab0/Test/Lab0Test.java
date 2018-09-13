import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lab0Test {
    private Lab0 testobj;

    @Before
    public void myBeginSetUp()
    {
        testobj = new Lab0();
    }

    @Test
    public void beginTaskTest1()
    {
        assertEquals(4,testobj.beginTask((2)));
    }
}