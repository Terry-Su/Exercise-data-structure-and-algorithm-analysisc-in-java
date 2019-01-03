public class QueueExample {
    public static void main(String[] args) {
        Queue queue = new Queue( 100 );

        // # enquue items
        queue.enqueue( 'a' );
        queue.enqueue( 'b' );
        queue.enqueue( 'c' );
        queue.enqueue( 'd' );
        queue.enqueue( 'e' );

        // # dequeue items
        queue.dequeue();
        queue.dequeue();

        while( !queue.isEmpty() ) {
            char c = queue.dequeue();
            System.out.println( c );
        }
    }
}
