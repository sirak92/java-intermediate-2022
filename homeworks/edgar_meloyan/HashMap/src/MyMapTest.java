import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.Soundbank;

public class MyMapTest {
    public static void main(String[] args) {
        XashMap<Integer, String> map = new XashMap<>();
        System.out.println("Map before putting elements is empty - " + map.isEmpty());
        map.put(4, "Four");
        map.put(9, "Nine");
        map.put(4, "three + 1");
        map.put(3, "Three");
        System.out.println("Map contains key 3 - " + map.containsKey(3));
        System.out.println("Map, after putting elements: \n");
        map.print();
        map.remove(9);
        System.out.println("\nMap, after removing element: \n");
        map.print();
        System.out.println("\nMap contains key 0 - " + map.containsKey(0));
        System.out.println("Map after checking all methods is empty - " + map.isEmpty());
    }
}
