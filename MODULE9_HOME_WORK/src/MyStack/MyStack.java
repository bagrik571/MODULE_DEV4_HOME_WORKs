package MyStack;


public class MyStack<T> {
    private Object[] stack;;
    private int size;
    private int top;

    public MyStack(Object[] stack, int size, int top) {
        this.stack = new Object[size];
        this.size = size;
        this.top = -1;
    }

    public void push(T value) {
        if (top == size - 1)
            System.out.println("Stack is Full!!! Insertion is not possible!!!");
        else {
            top++;
            stack[top] = value;
            System.out.println(stack[top] + " - Insertion success!!!");
        }
    }

    public T pop() {
        if (top == -1) {
            System.out.println("Stack is Empty!!! Deletion is not possible!!!");
            return null;
        } else {
            T poppedValue = (T) stack[top];
            top--;
            return poppedValue;
        }
    }

    public T peek() {

        if (top == -1) {
            System.out.println("Stack is Empty!!!");
            return null;
        } else {
            return (T) stack[top];
        }
    }

    public int size() {
        return top + 1;
    }

    public void remove(int index) {
        if (index < 0 || index > top) {
            System.out.println("Invalid index for removal!!!");
        } else {
            for (int i = index; i < top; i++) {
                stack[i] = stack[i + 1];
            }
            stack[top] = null;
            top--;
            System.out.println("Removal at index " + index + " success!!!");
        }
    }

    public void clear() {
        while (top != -1) {
            stack[top] = null;
            top--;
        }
        System.out.println("Stack is cleared!!!");
    }

    void display() {
        if (top == -1)
            System.out.println("Stack is Empty!!!");
        else {
            int i;
            System.out.println("Stack elements are: ");
            for (i = top; i >= 0; i--)
                System.out.println(stack[i]);
        }
    }
}

