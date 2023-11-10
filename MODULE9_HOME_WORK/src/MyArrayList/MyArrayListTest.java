package MyArrayList;


public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList();
        System.out.println("My Array List: ");
        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add("C#");
        arrayList.add("javaScript");
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.printAll();
        arrayList.add("Some new");
        System.out.println("------------");
        System.out.println("MyArrayList after added new element: ");
        arrayList.printAll();
        System.out.println("------------");
        System.out.println("Get element with index 5 from MyArrayList: " + arrayList.get(5));
        System.out.println("------------");
        System.out.println("Get MyArrayList size: " + arrayList.size());
        arrayList.remove(6);
        System.out.println("------------");
        System.out.println("Get MyArrayList size without remove element: " + arrayList.size());
        System.out.println("------------");
        arrayList.clear();
        System.out.println("Get MyArrayList size after clear: " + arrayList.size());


    }
}
