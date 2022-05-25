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
     * Returns true if the given value is present in the map, false otherwise.
     */
    boolean containsValue(V val);

    /**
     * Returns a set of all entries that the map contains.
     */
    Set<XashMap.Entry<K, V>> entrySet();

    /**
     * Returns a set consisting of all the keys in the map.
     */
    Set<K> keySet();

    /**
     * Removes the key from the map if it is present.
     * Returns the value associated with that key.
     */
    V remove(K key);

    /**
     * Return true if the map is empty (contains no elements), false otherwise.
     */
    boolean isEmpty();

    /**
     * Returns a List view of the values contained in this map.
     */
//    List<V> values();

    /**
     * Prints the keys and their corresponding values.
     */
    void print();

}
