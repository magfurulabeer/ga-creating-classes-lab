package test;

import com.generalassembly.Animal;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {
    Animal a;


    @Before
    public void initialize() {
        a = new Animal("Cat", 4, 30f, false);

    }

    @Test
    public void printsCorrectTest() {
        String givenFact = a.getFact();
        String actualFact = "The Cat has a top speed of 30mph.";
        assertEquals(givenFact, actualFact);
    }

    @Test
    public void createsProperAnimal() {
        assertEquals(a.getName(), "Cat");
        assertEquals(a.getNumLegs(), 4);
        assertEquals(a.getTopSpeed(), 30f, 0f);
        assertFalse(a.isEndangered());
    }

    @Test
    public void retrievesCorrectProperties() {
        assertEquals(a.getName(), "Cat");
        assertEquals(a.getNumLegs(), 4);
        assertEquals(a.getTopSpeed(), 30f, 0f);
        assertFalse(a.isEndangered());
    }

    @Test
    public void modifiesPropertiesCorrectly() {
        String name = "Panda";
        float speed = 20f;
        int numLegs = 4;
        boolean isEndangered = true;

        a.setName(name);
        a.setTopSpeed(speed);
        a.setNumLegs(numLegs);
        a.setEndangered(isEndangered);

        assertEquals(a.getName(), name);
        assertEquals(a.getNumLegs(), numLegs);
        assertEquals(a.getTopSpeed(), speed, 0f);
        assertTrue(a.isEndangered());
    }


}
