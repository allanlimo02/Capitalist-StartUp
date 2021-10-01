package model;

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
    @Test
    public void getName_getsname_correctly() throws Exception{
        StartUps testStartUp = new StartUps("Jeff Bezos", "Amazon", "E-commerce", 500);
        assertEquals("Jeff Bezos", testStartUp.getName());
    }
    @Test
    public void getNameOfStartup_works_correctly() throws Exception{
        StartUps testStartUp = new StartUps("Jeff Bezos", "Amazon", "E-commerce", 500);
        assertEquals("Amazon", testStartUp.getName_of_startup());
    }
    @Test
    public void getCategory_gets_category_correctly() throws Exception{
        StartUps testStartUp = new StartUps("Jeff Bezos", "Amazon", "E-commerce", 500);
        assertEquals("E-commerce", testStartUp.getCategory());
    }
    @Test
    public void getCapital_getsCapital_correctly() throws Exception{
        StartUps testStartUp = new StartUps("Jeff Bezos", "Amazon", "E-commerce", 500);
        assertEquals(500, testStartUp.getCapital_needed());
    }

}