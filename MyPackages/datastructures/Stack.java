package MyPackages.datastructures;

public class Stack {
    private int[] array;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = 0;
    }

    public void push(int value) {
        if (top == capacity) {
            resizeAndCopy();
        }
        array[top++] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return -1;
        }
        return array[--top];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return -1;
        }
        return array[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    private void resizeAndCopy() {
        int newCapacity = capacity * 2;
        int[] newArray = new int[newCapacity];
        System.arraycopy(array, 0, newArray, 0, capacity);
        array = newArray;
        capacity = newCapacity;
    }
}
