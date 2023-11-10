package MyLinkedList;


public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        System.out.println("My linked List: ");
        linkedList.add("Element1");
        linkedList.add("Element2");
        linkedList.add("Element3");
        linkedList.add("Element4");
        linkedList.printAll();
        System.out.println("Get Linked List size: " + linkedList.size());
        System.out.println("-------------------");
        System.out.println("Get element with index 2: " + linkedList.get(2));
        System.out.println("-------------------");
        System.out.println("Remove Element2");
        linkedList.remove(1);
        linkedList.printAll();
        System.out.println("-------------------");
        linkedList.clear();
        System.out.println("Get Linked List size: " + linkedList.size());
        System.out.println("-------------------");

    }

    }
