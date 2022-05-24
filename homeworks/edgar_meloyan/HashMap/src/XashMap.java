import java.util.HashSet;
import java.util.Set;

public class XashMap<K, V> implements HommieHashMap<K, V> {
    static class Entry<K, V> {
        K key;
        V val;
        Entry<K, V> next;
        int size = 0;

        public Entry(K key, V val, Entry<K, V> next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    private final Entry<K, V>[] buckets;

    public XashMap() {
        this.buckets = new Entry[16];
    }


    private int getHash(K key) {
        return key.hashCode() % buckets.length;
    }

    private boolean isEqual(K key) {
        Entry<K, V> current = buckets[getHash(key)];
        return (current.key.hashCode() == key.hashCode() && current.key.equals(key));
    }

    @Override
    public V put(K key, V val) {
        Entry<K, V> entry = new Entry<>(key, val, null);
        Entry<K, V> current = buckets[getHash(key)];

        if (current == null) {
            buckets[getHash(key)] = entry;
            buckets[getHash(key)].size++;
            return null;
        } else {
            while (current.next != null) {
                if (isEqual(key)) {
                    V oldVal = current.val;
                    current.val = val;
                    return oldVal;
                }
                current = current.next;
            }
            if (isEqual(key)) {
                current.val = val;
            } else {
                current.next = entry;
                current.size++;
            }
        }
        return null;
    }

    @Override
    public V get(K key) {
        Entry<K, V> current = buckets[getHash(key)];

        while (current != null) {
            if (isEqual(key)) {
                return current.val;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        Entry<K, V> current = buckets[getHash(key)];

        while (current != null) {
            if (isEqual(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean containsValue(V val) {
        for (Entry<K, V> current : buckets) {
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
    public boolean isEmpty() {
        for (Entry<K, V> current : buckets) {
            if (current != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public V remove(K key) {
        Entry<K, V> current = buckets[getHash(key)];

        if (current == null) {
            return null;
        }
        if (isEqual(key)) {
                buckets[getHash(key)] = current.next;
                return current.val;
        }

        while (current.next != null) {
            if (isEqual(key)) {
                current.next = current.next.next;
                return current.next.val;
            }
            current = current.next;
        }
        return null;
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
    public void print() {
        for (Entry<K, V> current : buckets) {
            while (current != null) {
                System.out.println("Key: " + current.key + "; Value: " + current.val + " ");
                current = current.next;
            }
        }
    }
}
