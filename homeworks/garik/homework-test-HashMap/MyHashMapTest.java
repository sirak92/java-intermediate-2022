package hashMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyHashMapTest {
    MyHashMap<Integer, String> myHashMap;

    @BeforeEach
    public void init() {
        myHashMap = new MyHashMap<>();
        myHashMap.put(5, "five");
        myHashMap.put(6, "six");
        myHashMap.put(8, "eight");
    }

    @Test
    public void testPut() {
        assertEquals(myHashMap.put(7, "Seven"), "Seven");
    }

    @Test
    public void testget() {

        assertEquals(myHashMap.get(6), "six");
    }

    @Test
    public void containsKeyTest() {
        assertTrue(myHashMap.containsKey(5));
    }
    @Test
    public void containValueTest(){
        assertTrue(myHashMap.containsValue("six"));
    }

}
