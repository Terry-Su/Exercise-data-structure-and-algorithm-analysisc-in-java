/**
 * Simple priority queue
 * from big to small
 */
public class Queue_PriorityQueue {
    int[] data;
    int frontIndex = 0;
    int rearIndex = -1;
    int maxSize;
    int count = 0;

    public Queue_PriorityQueue( int size ) {
        data = new int[size];
        maxSize = size;
    }

    public void insert( int item ) {
        if ( count == 0 ) {
            data[ 0 ] = item;
            count = count + 1;
        } else {
            int i = count - 1;

            // shift the position of the targets that are smaller than item
            for ( ; i >= 0; i-- ) {
                if ( item > data[ i ] ) {
                    // item is bigger, shift target to rear
                    data[ i + 1 ] = data[ i ];
                } else {
                    // item is smaller, shift to front
                    break;
                }
            }

            // insert
            data[i+1] = item;
            count = count + 1;
        }
    }

    public int removeMini() {
        int res = data[ count - 1 ];
        count = count - 1;
        return res;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}
