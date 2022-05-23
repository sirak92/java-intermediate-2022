import java.util.*;

public class SomeMap<K, V> {
    private Entry<K, V>[] buckets;
    SomeMap(int bucketsLength) {
        buckets = new Entry[bucketsLength];
    }

    public static void main(String[] args) {
        SomeMap<String, Integer> map = new SomeMap(4);
        map.put("griqor", 5);
        map.put("griqor", 6);
        map.put("smth", 9);
        map.get("smth");
        map.put("smth1", 4);
        map.containsKey("griqr");
        map.containsValue(4);
        map.print();
        map.entrySet();
    }

    public V get(K key) {
        Entry current;
        int bucketsIndex = key.hashCode() & buckets.length - 1;
        if (buckets[bucketsIndex] == null) {
            System.out.println("there is nothing like that");
        }
        current = buckets[bucketsIndex];
        while (current != null) {
            if (current.key == key) {
                System.out.println(key + ": " + current.val);
                return (V) current.val;

            }
            current = current.next;
        }
        return null;
    }
    Set<Entry<K,V>> entrySet(){
    Set entrySet = new HashSet();
    Entry current;
    for(int i=0;i< buckets.length;i++){
        if(buckets[i]==null){i++;}
        current=buckets[i];
        while(current!=null){
            entrySet.add(current);
            current=current.next;
        }
    }
        System.out.println("Done");
    return entrySet;
    }
    public Set<K> keySet(){
        Set keySet = new HashSet();
        Entry current;
        for(int i=0;i< buckets.length;i++){
            if(buckets[i]==null){i++;}
            current=buckets[i];
            while(current!=null){
                keySet.add(current.key);
            }
        }
    return keySet;
    }
    V remove(K key){
        int bucketIndex = key.hashCode()& buckets.length-1;
        Entry current;
        V temp;
        if(buckets[bucketIndex]==null){
            return null;
        }
        current=buckets[bucketIndex];
        while (current!=null){
            if(current.key.equals(key)){
                temp=(V)current.val;
                current=current.next;
                return temp;
            }
            current=current.next;
        }
        return null;
    }
    Boolean isEmpty(){
        for(int i=0;i< buckets.length;i++){
            if(buckets[i]!=null){
                return false;
            }

        }
        return true;
    }
    List<V> values(){
        List list = new ArrayList();
        Entry current;
        for(int i=0;i<buckets.length;i++){
            if(buckets[i]==null){i++;}
        current=buckets[i];
            while(current!=null){
                list.add(current.val);
            current=current.next;
            }
        }
        return list;
    }
    Boolean containsValue(V val) {
        Entry current;
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] == null) {
                i++;
            }
            current = buckets[i];
            while (current != null) {
                if (current.val == val) {
                    System.out.println("here it is");
                    return true;
                }
                current = current.next;
            }
        }
        System.out.println("there is nothing like that");
        return false;
    }

    Boolean containsKey(K key) {
        int bucketIndex = key.hashCode() & buckets.length - 1;
        Entry current;
        if (buckets[bucketIndex] == null) {
            System.out.println("there is nothing like that");
            return false;
        }
        current = buckets[bucketIndex];
        while (current != null) {
            if (current.key == key) {
                return true;
            }
            current = current.next;
        }
        System.out.println("there is nothing like that");
        return false;
    }


    public V put(K key, V val) {
        Entry<K, V> newEntry = new Entry<K, V>(key, val);
        Entry<K, V> current;
        int bucketsIndex = newEntry.key.hashCode() & buckets.length - 1;
        if (buckets[bucketsIndex] == null) {
            buckets[bucketsIndex] = newEntry;
            return newEntry.val;
        }
        if (buckets[bucketsIndex].key.equals(key)) {
            V temp = buckets[bucketsIndex].val;
            buckets[bucketsIndex].val = val;
            return temp;
        }
        current = buckets[bucketsIndex];
        while (current.next != null) {
            current = current.next;
            if (current.key.equals(key)) {
                V temp = current.val;
                current.val = val;
                return temp;
            }
        }
        current.next = newEntry;
        return newEntry.val;
    }

    public void print() {
        for (int i = 0; i < buckets.length; i++) {
            Entry<K, V> current = buckets[i];
            while (current != null) {
                System.out.println(current.val);
                current = current.next;
            }
        }
    }

    static class Entry<K, V> {
        K key;
        V val;
        Entry<K, V> next;

        Entry(K key, V val) {
            this.key = key;
            this.val = val;
        }

        Entry(K key, V val, Entry next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }

    }
}
