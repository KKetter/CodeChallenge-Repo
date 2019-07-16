package hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void testHash(){
        Hashtable hashtable = new Hashtable(31);
        int hashKeyTest = hashtable.hash("test");
        assertEquals(16, hashKeyTest);
    }

    @Test
    public void addTest() {
        Hashtable ht = new Hashtable(3);
        ht.add("Thing1", "thing1");
        ht.add("Thing2", "thing2");
        ht.add("Thing3", "thing3");
        assertTrue(ht.get("Thing3").equals("thing3"));
    }

    @Test
    public void addCollisionTest() {
        Hashtable ht = new Hashtable(3);
        ht.add("Thing1", "thing1");
        ht.add("Thing1", "thing2");
        ht.add("Thing1", "thing3");
        //test also outputs two "This key exists-try another" messages to the console
        assertTrue(ht.get("Thing1").equals("thing1"));
        assertFalse(ht.get("Thing1").equals("thing2"));
    }

    @Test
    public void getEmptyTest() {
        Hashtable ht = new Hashtable(1);
        assertNull(ht.get("wow"));
    }

    @Test
    public void getTest() {
        Hashtable ht = new Hashtable(1);
        ht.add("ThingWow", "wow");
        assertTrue(ht.get("ThingWow").equals("wow"));
    }

    @Test
    public void containsFalseTest() {
        Hashtable ht = new Hashtable(3);
        ht.add("Snuggle", "snuggle");
        assertFalse(ht.contains("Cuddle"));
    }

    @Test
    public void containsSingleTest() {
        Hashtable ht = new Hashtable(1);
        ht.add("Snuggle", "snuggle");
        assertTrue(ht.contains("Snuggle"));
    }
}