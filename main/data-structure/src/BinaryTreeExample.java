public class BinaryTreeExample {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree( 1, 'a' );
        bt.insert( 3, 'b' );
        bt.insert( 2, 'c' );
        bt.insert( 5, 'd' );
        bt.insert( 4, 'e' );
        bt.insert( 7, 'f' );
        bt.insert( 9, 'g' );
        bt.insert( 8, 'h' );


        bt.traverseInOrder( bt.getRoot() );

    }
}
