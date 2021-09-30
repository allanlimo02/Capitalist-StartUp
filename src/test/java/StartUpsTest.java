//package ;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.StartUps;

import static org.junit.Assert.*;

public class StartUpsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void startUpInstantiatesCorrectly() throws Exception{
        StartUps testStartUp = setUpStartUp();
        assertEquals(true, testStartUp instanceof StartUps);
    }

    @Test
    public void startUpInstantiatesWithName() throws  Exception{
        StartUps testStartUp = setUpStartUp();
        assertEquals("Jeff Bezos", testStartUp.getName());
    }

    @Test
    public void startUpInstantiatesWithStartUpName() throws  Exception{
        StartUps testStartUp = setUpStartUp();
        assertEquals("Amazon", testStartUp.getName_of_startup());
    }

    @Test
    public void startUpInstantiatesWithCategory(){
        StartUps testStartUp = setUpStartUp();
        assertEquals("E-commerce", testStartUp.getCategory());
    }

    @Test
    public void startUpInstantiatesWithCapital(){
        StartUps testStartUp = setUpStartUp();
        assertEquals(500, testStartUp.getCapital_Needed())
    }

    // Helper methods
    public StartUps setUpStartUp(){
        return new StartUps("Jeff Bezos", "Amazon", "E-commerce", 500);
    }
}