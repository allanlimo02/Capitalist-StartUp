import model.StartUps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StartUpsTest {
    StartUps startUps;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void startUpInstantiatesCorrectly() throws Exception{
        StartUps testStartUp = new StartUps("Jeff Bezos", "Amazon", "E-commerce", 500);
        assertEquals(true, testStartUp instanceof StartUps);
    }
}