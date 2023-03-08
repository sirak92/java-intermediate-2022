
import com.company.MyHashMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashMapTests {
    private MyHashMap<Integer, String> myHashMap;

    @BeforeEach
    private void setup() {
        myHashMap = new MyHashMap<>();
    }

    @Test
    public void testSize() {

        assertEquals(0, myHashMap.size());
        myHashMap.put(1, "a");
        assertEquals(1, myHashMap.size());
        myHashMap.remove(1);
        myHashMap.get(1);
        assertEquals(0, myHashMap.size());
    }

    @Test
    public void testPut() {
        assertEquals(0, myHashMap.size());
        myHashMap.put(1, "a");
        assertEquals(1, myHashMap.size());
        myHashMap.remove(1);
        myHashMap.put(1, "ab");
        myHashMap.put(1, "abc");
        myHashMap.put(2, "42");
        assertEquals(1, myHashMap.size());
    }

    @Test
    public void testGetReturnsCorrectValue() {
        myHashMap.put(1, "abc");
        myHashMap.put(2, "bcd");
        assertEquals("abc", myHashMap.get(1));
        assertEquals("bcd", myHashMap.get(2));
    }

    @Test
    public void testReplaceValueWithSameKey() {
        myHashMap.put(1, "Paris");
        myHashMap.put(1, "Kathmandu");
        assertEquals("Kathmandu", myHashMap.get(1));
    }

    // Make sure that two (non-equal) keys with the same hash do not overwrite each other
    @Test
    public void testDoesNotOverwriteEachOtherWithSameHashDifferentKey() {
        myHashMap.put(18, "Yerevan");
        myHashMap.put(9, "Canberra");
        assertEquals("Yerevan", myHashMap.get(18));
        assertEquals("Canberra", myHashMap.get(9));
    }

    @Test
    public void testContainsKeyIfExistingKey() {
        myHashMap.put(15, "Aparan");
        assertTrue(myHashMap.containsKey(15));
        assertFalse(myHashMap.containsKey(12));

    }

    @Test
    public void testisEmpty() {
        assertTrue(myHashMap.isEmpty());
        myHashMap.put(17, "Ashtarak");
        assertFalse(myHashMap.isEmpty());
    }

    @Test
    public void testRemoveDecrementsSize() {
        myHashMap.put(1, "Malatia");
        myHashMap.put(2, "Karin");
        myHashMap.put(3, "Sasun");
        myHashMap.remove(3);
        assertEquals(2, myHashMap.size());

    }

    @Test
    public void testRemove() {
        myHashMap.put(1, "Ando");
        assertFalse(myHashMap.isEmpty());
        myHashMap.put(2, "Davo");
        myHashMap.remove(1);
        assertFalse(myHashMap.isEmpty());
        myHashMap.remove(2);
        assertTrue(myHashMap.isEmpty());
    }
}
