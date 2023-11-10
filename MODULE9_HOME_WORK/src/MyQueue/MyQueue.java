package MyQueue;

public class MyQueue<T> {
    private Node<T> head;
    private Node<T> tail;

    public void add(T t) {
        Node<T> node = new Node<>(t);
        if (head == null) {
            head = node;
        }
        if (tail != null) {
            tail.nextNode = node;
        }
        tail = node;
    }

    public void clear() {
        head = null;
        tail = null;
        System.out.println("Queue is clear!");
    }

    public void size() {
        Node<T> current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.nextNode;
        }
        System.out.println("Size is: " + count);
    }

    public T peek() {
        if (head != null) {
            return head.value;
        }
        return null;
    }

    public void printAll() {
        while (head != null) {
            System.out.println("Print: " + head.value);
            head = head.nextNode;
        }
    }

    public void poll() {
        head = head.nextNode;
        if (head == null) {
            tail = null;
        }
    }

    private static class Node<T> {
        private Node<T> nextNode;
        private T value;

        public Node(T value) {
            this.value = value;
        }
    }
}
