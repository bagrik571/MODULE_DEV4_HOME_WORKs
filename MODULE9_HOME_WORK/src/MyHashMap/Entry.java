package MyHashMap;

public class Entry <K, V>{
    private K key;

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setNextEntry(Entry<K, V> nextEntry) {
        this.nextEntry = nextEntry;
    }

    private V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Entry<K, V> getNextEntry() {
        return nextEntry;
    }

    private Entry<K, V> nextEntry;
}
