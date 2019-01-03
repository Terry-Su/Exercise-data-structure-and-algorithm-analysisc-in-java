public class Queue {
    char[] data;
    private int frontIndex;
    private int rearIndex;
    private int maxSize;

    public Queue( int size ) {
        data = new char[ size ];
        frontIndex = 0;
        rearIndex = -1;
        maxSize = size;
    }

    public void enqueue( char item ) {
        if ( rearIndex == maxSize - 1 ) {
            rearIndex = -1;
        }
        rearIndex = rearIndex + 1;
        data[ rearIndex ] = item;
    }

    public char dequeue() {
        char removed = data[ frontIndex ];
        if ( frontIndex == maxSize - 1 ) {
            frontIndex = -1;
        }
        frontIndex = frontIndex + 1;
        return removed;
    }

    public char peek() {
        return data[ frontIndex ];
    }

    public boolean isEmpty() {
        return frontIndex - rearIndex == 1 || rearIndex - frontIndex == maxSize - 1;
    }
}
