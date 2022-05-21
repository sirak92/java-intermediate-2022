public class MyHashMapTest {

    public static void main(String[] args) {
        MyHashMap<Integer, Integer> map = new MyHashMap<>();
        System.out.println(map.isEmpty());
        map.put(15, 15);
        map.put(31, 15);
        map.put(21, 55);
        map.put(113, 195);
        map.print();
        System.out.println(map.containsKey(0));
        map.put(0, 44);
        map.put(16, 50);
        map.put(66, 59);
        map.print();
        System.out.println(map.containsKey(0));
        map.remove(0);
        map.print();
        System.out.println(map.containsKey(0));
        map.remove(16);
        map.print();
        System.out.println(map.containsKey(16));
        System.out.println(map.isEmpty());
        System.out.println(map.containsValue(195));
        System.out.println(map.containsValue(44));
        /**
         * Heare is output
         * //
         * //
         * //
         * true
         * key: 113 val: 195 
         * key: 21 val: 55 
         * key: 15 val: 15 key: 31 val: 15 
         * false
         * key: 0 val: 44 key: 16 val: 50 
         * key: 113 val: 195 
         * key: 66 val: 59 
         * key: 21 val: 55 
         * key: 15 val: 15 key: 31 val: 15 
         * true
         * key: 16 val: 50 
         * key: 113 val: 195 
         * key: 66 val: 59 
         * key: 21 val: 55 
         * key: 15 val: 15 key: 31 val: 15 
         * false
         * key: 113 val: 195 
         * key: 66 val: 59 
         * key: 21 val: 55 
         * key: 15 val: 15 key: 31 val: 15 
         * false
         * false
         * true
         * false
         * 
         */
    }
}