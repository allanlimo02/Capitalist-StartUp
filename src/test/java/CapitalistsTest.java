import model.Capitalists;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sql2oDao.Sql2oCapitalists;

import static org.junit.Assert.*;

public class CapitalistsTest {

    Sql2oCapitalists capitalistsdao = new Sql2oCapitalists();
    @Test
    public void create() {
        Capitalists capitalists = new Capitalists("lion",7,"fight");
        int myid = capitalists.getId();
        capitalistsdao.create(capitalists);
        assertEquals(myid,capitalists.getId());
    }

    @Test
    public void findById() {
        Capitalists capitalists = new Capitalists("rashid",3,"biz");
        capitalistsdao.create(capitalists);
        Capitalists foundCapitalist = capitalistsdao.findById(capitalists.getId());
        assertNotEquals(capitalists,foundCapitalist);
    }
}