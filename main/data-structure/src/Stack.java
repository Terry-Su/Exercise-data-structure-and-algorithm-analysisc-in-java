public class Stack {
    private char[] data = new char[100];
    private int topIndex = -1;

    public Stack( int stackSize ) {
        data = new char[stackSize];
    }

    public void push(char item) {
        topIndex = topIndex + 1;
        data[topIndex] = item;
    }

    public char pop() {
        int prevTopIndex = topIndex;
        topIndex = topIndex - 1;
        return data[prevTopIndex];
    }

    public char peek() {
        return data[topIndex];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public int length() {
        return topIndex + 1;
    }
}
