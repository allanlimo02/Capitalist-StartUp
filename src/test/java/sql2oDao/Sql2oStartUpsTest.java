package sql2oDao;

import model.StartUps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Sql2oStartUpsTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
    }

    @Test
    public void startUps() {
    }

    @Test
    public void deleteAllPostsDeletesAllPosts() {
        StartUps testStartUp = new StartUps("Jeff Bezos", "Amazon", "E-commerce", 500);
        StartUps testStartUp1 = new StartUps("Allan Limo", "Mekaki", "Tourism", 500000);

//        Sql2oStartUps.deleteAll();
//        assertEquals(0,Sql2oStartUps.findAll().size());



    }

    @Test
    public void deleteById() {
    }
}