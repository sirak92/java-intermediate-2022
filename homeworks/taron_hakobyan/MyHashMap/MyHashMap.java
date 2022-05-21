
import java.util.*;

public class MyHashMap<K, V> implements HommieHashMap<K, V> {
    private Entry<K, V>[] buckets;

    static class Entry<K, V> {
        K key;
        V val;
        Entry<K, V> next;
        int length = 0;

        public Entry(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    public MyHashMap() {
        this.buckets = new Entry[16];
    }

    private void resizeMap(MyHashMap map) {
        Entry<K, V>[] oldBuckets = map.buckets;
        map.buckets = new Entry[map.buckets.length * 2];
        for (Entry<K,V> oldBucket : oldBuckets) {
            Entry<K,V> current = oldBucket;
            while (oldBucket != null) {
                int bucketIndex = current.key.hashCode() % map.buckets.length;
                map.put0(current);
                current = current.next;
            }
        }
    }

    private V put0(Entry<K, V> entry) {
        return put(entry.key, entry.val);
    }

    public V put(K key, V val) {
        int bucketIndex = key.hashCode() % buckets.length;

        if (buckets[bucketIndex] == null) {
            buckets[bucketIndex] = new Entry<>(key, val);
            buckets[bucketIndex].length++;
            return null;
        }

        Entry<K, V> current = buckets[bucketIndex];
        if (current.key.hashCode() == key.hashCode()) {
            if (current.key.equals(key)) {
                V oldValue = current.val;
                current.val = val;
                return oldValue;
            }
        }

        if (current.key.hashCode() == key.hashCode()) {
            if (current.key != key) {
                V oldValue = current.val;
                current.key = key;
                current.val = val;
                return oldValue;
            }
        }

        while (current.next != null) {
            if (current.key.hashCode() == key.hashCode()) {
                if (current.key.equals(key)) {
                    V oldValue = current.val;
                    current.val = val;
                    return oldValue;
                }
            }
            current = current.next;
        }
        current.next = new Entry<>(key, val);
        if (++buckets[bucketIndex].length >= 5) {
            resizeMap(this);
        }
        return null;
    }


    public V get(K key) {
        int bucketIndex = key.hashCode() % buckets.length;
        Entry<K, V> current = buckets[bucketIndex];
        while (current != null) {
            if (current.key.hashCode() == key.hashCode()) {
                if (current.key.equals(key)) {
                    return current.val;
                }
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        int bucketIndex = key.hashCode() % buckets.length;
        Entry<K, V> current = buckets[bucketIndex];
        while (current != null) {
            if (current.key.hashCode() == key.hashCode()) {
                if (current.key.equals(key)) {
                    return true;
                }
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean containsValue(V val) {
        for (Entry<K,V> bucket : buckets) {
            Entry<K,V> current = bucket;
            while (current != null) {
                if (current.val.equals(val)) {
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = new HashSet<>();

        for (Entry<K, V> bucket : buckets) {
            Entry<K, V> current = bucket;
            while (current != null) {
                set.add(current);
                current = current.next;
            }
        }
        return set;
    }

    @Override
    public Set<K> keySet() {
        Set<K> kSet = new HashSet<>();
        for (Entry<K, V> bucket : buckets) {
            Entry<K, V> current = bucket;
            while (current != null) {
                kSet.add(current.key);
                current = current.next;
            }
        }
        return kSet;
    }

    @Override
    public V remove(K key) {
        if (!containsKey(key)) {
            return null;
        }

        int bucketIndex = key.hashCode() % buckets.length;
        Entry<K, V> current = buckets[bucketIndex];

        if (current == null) {
            return null;
        }
        if (current.key.hashCode() == key.hashCode()) {
            if (buckets[bucketIndex].key.equals(key)) {
                buckets[bucketIndex] = current.next;
                return current.val;
            }
        }
        if (current.next != null) {
            if (current.next.key.hashCode() == key.hashCode()) {
                if (current.next.key.equals(key)) {
                    current.next = current.next.next;
                    return current.next.val;
                }
            }
            current = current.next;
        }

        return null;
    }

    @Override
    public boolean isEmpty() {
        for (Entry<K, V> current : buckets) {
            if (current != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public List<V> values() {
        List<V> vList = new ArrayList<>();
        Set<Entry<K, V>> entries = entrySet();
        for (Entry<K, V> current : entries) {
            vList.add(current.val);
        }
        return vList;
    }

    private boolean printBucket(Entry<K, V> bucket) {
        Entry<K, V> current = bucket;
        int i = 0;
        while (current != null) {
            System.out.print("key: " + current.key + " val: " + current.val + " ");
            current = current.next;
            i++;
        }
        return i >= 1;
    }

    public void print() {
        for (Entry<K, V> bucket : buckets) {
            if (printBucket(bucket)) {
                System.out.println();
            }
        }
    }
}
