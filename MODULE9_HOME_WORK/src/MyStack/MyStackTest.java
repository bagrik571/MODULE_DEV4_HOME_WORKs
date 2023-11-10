package MyStack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<String>(new Object[5], 5, -1);
        myStack.push("4125");
        myStack.push("aloe");
        myStack.push("09321564");
        myStack.push("Valera");
        myStack.push("Victoria");
        System.out.println("------------------");
        myStack.display();
        System.out.println("Stack size is: " + myStack.size());
        System.out.println("------------------");
        System.out.println("Return firs element and delete him: " + myStack.pop());
        myStack.display();
        System.out.println("------------------");
        System.out.println("Return first element: " + myStack.peek());
        System.out.println("------------------");
        myStack.remove(3);
        myStack.display();
        System.out.println("Stack size is: " + myStack.size());
        System.out.println("------------------");
        myStack.clear();
    }
}
