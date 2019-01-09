public class ShellSortExample {
    public static void main(String[] args) {
        int size = 100;
        int[] a = new int[size];
        for ( int i = 0; i < size; i++ ) {
            int number = (int)(Math.random() * 100);
            a[ i ] = number;
        }

        for ( int i = 0; i < a.length; i++ ) {
            System.out.println( i );
        }
    }

    public static void shellSort( int[] a ) {

    }
}
