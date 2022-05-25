package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyHashMap<K, V> implements HommieHashMap<K, V> {
    private static final int CAPACITY = 4;
    private Entry<K, V>[] buckets;
    private int quanity = 0;

    public MyHashMap() {
        this.buckets = new Entry[CAPACITY];
    }

    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }



    private V putForZoom(Entry<K, V> entry) {
        return put(entry.key, entry.value);
    }

    @Override
    public V put(K key, V val) {
        if (CAPACITY * 0.75 < quanity) {
            zoomArray(this);
        }
        int bucketIndex = key.hashCode() % CAPACITY;
        Entry<K, V> newEntry = new Entry<>(key, val, null);
        if (buckets[bucketIndex] == null) {
            buckets[bucketIndex] = newEntry;
            quanity++;
            return val;
        }

        Entry<K, V> oldHashMap = buckets[bucketIndex];
        if (oldHashMap != null) {

            if (oldHashMap.key.hashCode() == key.hashCode()) {
                if (oldHashMap.key.equals(key)) {
                    oldHashMap.value = val;
                    return oldHashMap.value;
                } else {
                    Entry<K, V> last = getLast(oldHashMap);
                    last.next = newEntry;
                    return last.value;
                }
            }
        }
        return null;
    }

    private Entry<K, V> getLast(Entry<K, V> entry) {
        Entry<K, V> cur = entry;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    @Override
    public V get(K key) {
        Entry<K, V> getEntry = buckets[key.hashCode() % CAPACITY];
        while (getEntry != null) {
            if (getEntry.key.hashCode() == key.hashCode()) {
                if (getEntry.key.equals(key)) {
                    return getEntry.value;
                }
            }
            getEntry = getEntry.next;
        }
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        Entry<K, V> getEntry = buckets[key.hashCode() % CAPACITY];

        if (getEntry != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean containsValue(V val) {
        for (Entry<K, V> cur : buckets) {
            Entry<K, V> entry = cur;
            while (entry != null) {
                if (entry.value.equals(val)) {
                    return true;
                }
                entry = entry.next;
            }
        }
        return false;
    }
    private void zoomArray(MyHashMap map) {
        Entry<K, V>[] oldBuckets = map.buckets;
        map.buckets = new Entry[map.CAPACITY * 2];
        for (Entry<K, V> oldBucket : oldBuckets) {
            Entry<K, V> current = oldBucket;
            while (oldBucket != null) {
                map.putForZoom(current);
                current = current.next;
            }
        }

    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = new HashSet<>();
        for (Entry<K, V> cur : buckets) {
            Entry<K, V> entry = cur;
            while (entry != null) {
                set.add(entry);
                entry = entry.next;
            }

        }
        return set;
    }

    @Override
    public Set<K> keySet() {
        return null;
    }


    @Override
    public V remove(K key) {
        return null;


    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public List<V> values() {
        return null;
    }

    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<>();
        System.out.println(map.put(8, "five"));
        System.out.println(map.put(7, "five+two"));
//        System.out.println(map.put(6, "six"));
//        System.out.println(map.put(9, "seven"));
        System.out.println(map.put(8, "eight"));
        System.out.println(map.put(9, "nine"));
        System.out.println(map.put(10, "ten"));
//        System.out.println(map.put(5, "eight"));
        System.out.println(map.get(7));
        System.out.println(map.get(8));
        System.out.println(map.containsKey(8));
        //  System.out.println(map.containsValue("eight"));
        System.out.println(map.remove(8));
        Set<Entry<Integer, String>> set = map.entrySet();
        for (Entry<Integer, String> curr : set) {
            System.out.println(curr.key + "-----" + curr.value);
        }

    }
}
