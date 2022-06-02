package com.company;

public class MyHashMap<K, V> implements HommieHashMap<K, V> {

    public static class Entry<K, V> {
        private final K key;
        private V value;
        Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    Entry<K, V>[] hashTable = new Entry[3];
    private int size;
    private Entry<K, V> current;
    private Entry<K, V> previousCurrent;

    private boolean areEqual(K key1, K key2) {
        return key1.hashCode() == key2.hashCode() && (key1 == key2 || key1.equals(key2));
    }

    public V put(K key, V val) {
        int tableIndex = Math.abs(key.hashCode() % hashTable.length);
        Entry<K, V> entry = new Entry<>(key, val, null);
        Entry<K, V> bucket = hashTable[tableIndex];
        current = hashTable[tableIndex];
        if (current == null) {
            hashTable[tableIndex] = entry;
            current = hashTable[tableIndex];
            previousCurrent = current;
            size++;
            return val;
        } else {
            while (current != null) {
                if (areEqual(current.key, key)) {
                    V oldValue = current.value;
                    current.value = val;
                    return oldValue;
                }
                previousCurrent = current;
                current = current.next;
            }
            current = previousCurrent;
            current.next = entry;
            size++;

        }
        current = hashTable[tableIndex];
        return val;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public V get(K key) {
        int tableIndex = Math.abs(key.hashCode() % hashTable.length);
        Entry<K, V> bucket = hashTable[tableIndex];
        current = hashTable[tableIndex];
        while (current != null) {
            if (areEqual(current.key, key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    public boolean containsKey(K key) {
        int tableIndex = Math.abs(key.hashCode() % hashTable.length);
        Entry<K, V> bucket = hashTable[tableIndex];
        current = hashTable[tableIndex];
        while (current != null) {
            if (areEqual(current.key, key)) {

                return true;
            }
            current = current.next;
        }
        return false;
    }

    public V remove(K key) {
        int tableIndex = Math.abs(key.hashCode() % hashTable.length);
        Entry<K, V> bucket = hashTable[tableIndex];
        current = hashTable[tableIndex];
        while (current != null) {
            if (areEqual(current.key, key)) {
                V oldValue = current.value;
                current.value = null;

                current = current.next;

                size--;
                return oldValue;
            }
            current = current.next;

        }
        return null;
    }

}





