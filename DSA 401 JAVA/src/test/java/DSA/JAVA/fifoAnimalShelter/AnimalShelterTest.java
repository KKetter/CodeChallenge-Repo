package DSA.JAVA.fifoAnimalShelter;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void enqAnimalTest() {
        AnimalShelter test = new AnimalShelter();
        test.enqAnimal("cat");
        assertEquals("cat", test.cat.peek());
    }

    @Test(expected = NoSuchElementException.class)
    public void deqAnimal() {
        AnimalShelter test = new AnimalShelter();
        test.enqAnimal("cat");
        test.enqAnimal("cat");
        assertEquals("cat", test.deqAnimal("cat"));
        assertEquals(null, test.deqAnimal("chicken"));
        assertEquals(null, test.deqAnimal("dog"));


    }
}