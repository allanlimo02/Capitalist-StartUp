package sql2oDao;

import model.Capitalists;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Sql2oCapitalistsTest {

    Sql2oCapitalists capitalistsdao= new Sql2oCapitalists();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void create() {
        Capitalists capitalists = new Capitalists("lion","7","fight",8);
        int myid = capitalists.getId();
        capitalistsdao.create(capitalists);
        assertNotEquals(myid,capitalists.getId());
    }

    @Test
    public void findById() {
        Capitalists capitalists = new Capitalists("rashid","9","biz",9);
        capitalistsdao.create(capitalists);
        Capitalists foundCapitalist = capitalistsdao.findById(capitalists.getId());
        assertNotEquals(capitalists,foundCapitalist);
    }

    @Test
    public void deleteAll() {
    }

    @Test
    public void deleteById() {
    }
}