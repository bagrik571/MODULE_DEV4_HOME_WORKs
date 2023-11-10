package MyHashMap;

public class MyHashMap<K, V> {
    private Entry<K, V>[] buckets;

    public MyHashMap() {
        this.buckets = new Entry[10];
    }

    public void clear() {
        this.buckets = new Entry[10];
    }

    public void put(K key, V value) {
        int hash = key.hashCode();
        int bucketNumber = hash % buckets.length;
        Entry<K, V> kvEntry = new Entry<K, V>();
        kvEntry.setKey(key);
        kvEntry.setValue(value);

        if (buckets[bucketNumber] == null) {
            buckets[bucketNumber] = kvEntry;
        } else {
            kvEntry.setNextEntry(buckets[bucketNumber]);
            buckets[bucketNumber] = kvEntry;
        }
        System.out.println("Key " + key + " and Value " + value + " added to the myHashMap");
    }

    public V get(K key) {
        int hash = key.hashCode();
        int bucketNumber = hash % buckets.length;

        Entry<K, V> currentEntry = buckets[bucketNumber];
        while (currentEntry.getNextEntry() != null) {
            V v = checkEquals(currentEntry, key);
            if (v != null)
                return v;

            currentEntry = currentEntry.getNextEntry();
        }
        return checkEquals(currentEntry, key);

    }

    private V checkEquals(Entry<K, V> e, K key) {
        if (e.getKey().equals(key)) {
            return e.getValue();
        }
        return null;
    }

    public int size() {
        int size = 0;
        for (Entry<K, V> entry : buckets) {
            while (entry != null) {
                size++;
                entry = entry.getNextEntry();
            }
        }
        return size;
    }

    public void remove(K key) {
        int hash = key.hashCode();
        int bucketNumber = hash % buckets.length;

        Entry<K, V> currentEntry = buckets[bucketNumber];
        Entry<K, V> previousEntry = null;

        while (currentEntry != null && !currentEntry.getKey().equals(key)) {
            previousEntry = currentEntry;
            currentEntry = currentEntry.getNextEntry();
        }

        if (currentEntry != null) {
            if (previousEntry == null) {
                buckets[bucketNumber] = currentEntry.getNextEntry();
            } else {
                previousEntry.setNextEntry(currentEntry.getNextEntry());
            }
            System.out.println("Key " + key + " removed from the myHashMap");
        } else {
            System.out.println("Key " + key + " not found in the myHashMap");
        }
    }
}
