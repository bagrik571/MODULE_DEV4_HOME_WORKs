package MyQueue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<String>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");
        System.out.println("Peek: " + queue.peek());
        queue.poll();
        queue.size();
        queue.printAll();
        queue.clear();
        queue.printAll();

    }

}
