package MyLinkedList;

public class MyLinkedList<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;

    public void add(T val) {
        if (firstNode == null) {
            firstNode = new Node<>(null, null, val);
        } else if (lastNode == null) {
            lastNode = new Node<T>(firstNode, null, val);
            firstNode.setNextNode(lastNode);
        } else {
            Node<T> newLastNode = new Node<T>(lastNode, null, val);
            lastNode.setNextNode(newLastNode);
            lastNode = newLastNode;
        }
    }

    public void printAll() {
        Node<T> currentNode = firstNode;
        while (currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNextNode();
        }
    }
        public int size() {
            Node<T> currentNode = firstNode;
            int count = 0;
            while (currentNode != null) {
                count++;
                currentNode = currentNode.getNextNode();
            }
            return count;
        }
        public void clear(){
        firstNode = null;
        lastNode = null;
            System.out.println("Clear Linked List");
        }
        public T get(int index){
            Node<T> currentNode = firstNode;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getNextNode();
            }
            return currentNode.getValue();
        }
    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        if (index == 0) {
            firstNode = firstNode.getNextNode();
            if (firstNode == null) {
                lastNode = null;
            }
        } else {
            Node<T> currentNode = firstNode;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(currentNode.getNextNode().getNextNode());
            if (index == size() - 1) {
                lastNode = currentNode;
            }
        }
    }

    }
