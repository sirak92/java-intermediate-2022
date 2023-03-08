package com.company;


import java.util.List;
import java.util.Set;

public interface HommieHashMap<K, V> {

    /**
     * Puts a new association of the given key to the given value in the map.
     * If association with the given key already exists, value should be
     * overrode (overrided) and the old value should be returned.
     */
    V put(K key, V val);

    /**
     * Returns the value associated with the given key.
     */
    V get(K key);

    /**
     * Returns true if the given key is present in the map, false otherwise.
     */
    boolean containsKey(K key);

    /**
     * Removes the key from the map if it is present.
     * Returns the value associated with that key.
     */
    V remove(K key);

    /**
     * Return true if the map is empty (contains no elements), false otherwise.
     */
    boolean isEmpty();

}