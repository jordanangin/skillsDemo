import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class skillDemoTest {
    @Test
    public void multiply() {
        assertEquals(4, skillDemo.multiply(2,2));
    }
}
