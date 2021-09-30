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
    public void getContacts() {
        Capitalists capitalists = new Capitalists("Jeff bessos",4,"spaceX");
        assertEquals(4,capitalists.getContacts());
    }

    @Test
    public void getName() {
        Capitalists capitalists = new Capitalists("Jeff bessos",4,"spaceX");
        assertEquals("Jeff bessos", capitalists.getName());
    }



    @Test
    public void getCategory() {
        Capitalists capitalists = new Capitalists("Jeff bessos",4,"spaceX");
        assertEquals("spaceX",capitalists.getCategory());
    }


}