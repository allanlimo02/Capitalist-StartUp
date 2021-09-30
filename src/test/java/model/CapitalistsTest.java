package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalistsTest {

    @Test
    public void instance_Of_Capitalism()throws Exception {
        Capitalists capitalists = new Capitalists("Jeff bessos",4,"spaceX");
        assertEquals(true,capitalists instanceof Capitalists);
    }


    @Test
    public void getName() {\
        Capitalists capitalists = new Capitalists("Jeff bessos",4,"spaceX");
        assertEquals(4,getContacts());
    }

    @Test
    public void setName() {
    }

    @Test
    public void getContacts() {
    }

    @Test
    public void setContacts() {
    }

    @Test
    public void getCategory() {
    }

    @Test
    public void setCategory() {
    }
}