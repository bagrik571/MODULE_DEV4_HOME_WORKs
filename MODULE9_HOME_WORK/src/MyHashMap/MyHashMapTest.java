package MyHashMap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap();
        myHashMap.put("Key1", 1);
        myHashMap.put("Key2", 2);
        myHashMap.put("Key3", 3);
        myHashMap.put("Key4", 4);
        myHashMap.put("Key5", 5);
        myHashMap.put("Key6", 6);

        System.out.println("myHashMap size is: " + myHashMap.size());
        myHashMap.remove("Key2");
        System.out.println("myHashMap size is: " + myHashMap.size());
        System.out.println("Get Key 3 value: " + myHashMap.get("Key3"));
        System.out.println("Get clear");
        myHashMap.clear();
        System.out.println("myHashMap size is: " + myHashMap.size());
    }
}
