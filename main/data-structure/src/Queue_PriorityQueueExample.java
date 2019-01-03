public class Queue_PriorityQueueExample {
    public static void main(String[] args) {
        Queue_PriorityQueue priorityQueue = new Queue_PriorityQueue( 100 );

        priorityQueue.insert(1);
        priorityQueue.insert(3);
        priorityQueue.insert(4);
        priorityQueue.insert(2);
        priorityQueue.insert(5);

        while( ! priorityQueue.isEmpty() ) {
            System.out.println( priorityQueue.removeMini() );
        }
    }
}
