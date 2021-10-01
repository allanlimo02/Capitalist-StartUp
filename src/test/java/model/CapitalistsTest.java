package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalistsTest {

    @Test
    public void instance_Of_Capitalism()throws Exception {
        Capitalists capitalists = new Capitalists("Jeff bessos","4","spaceX",3);
        assertEquals(true,capitalists instanceof Capitalists);
    }
    @Test
    public void getContacts() {
        Capitalists capitalists = new Capitalists("Jeff bessos","4","spaceX",4);
        assertEquals(4,capitalists.getAmount());
    }
    @Test
    public void getName() {
        Capitalists capitalists = new Capitalists("Jeff bessos","4","spaceX",3);
        assertEquals("Jeff bessos", capitalists.getName());
    }
    @Test
    public void getCategory() {
        Capitalists capitalists = new Capitalists("Jeff bessos","4","spaceX",3);
        assertEquals("spaceX",capitalists.getCategory());
    }
}