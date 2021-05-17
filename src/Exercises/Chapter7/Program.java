package Exercises.Chapter7;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class Program {

    Laptop newLaptop;

    @Before
    public void createNewLaptopObject() {
        newLaptop = new Laptop("Mac", 37, 73);
    }

    @Test
    public void checksToSeeIfSuperConstructs() {
        assertEquals(37, newLaptop.getScreenSize(), .000);
    }
}
