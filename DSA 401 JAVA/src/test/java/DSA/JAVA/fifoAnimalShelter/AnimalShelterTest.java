package DSA.JAVA.fifoAnimalShelter;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void enqAnimalTest() {
        AnimalShelter test = new AnimalShelter();
        test.enqAnimal("cat");
        assertEquals("cat", test.cat.peek());
    }

    @Test
    public void deqAnimal() {
        AnimalShelter test = new AnimalShelter();
        test.enqAnimal("cat");
        assertEquals("cat", test.deqAnimal("cat"));
        test.enqAnimal("chicken");
        assertEquals("null", test.deqAnimal("chicken"));

    }
}