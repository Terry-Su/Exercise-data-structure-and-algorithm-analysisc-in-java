public class BinaryTree {
    private BinaryTreeNode root;

    public BinaryTreeNode getRoot() {
        return root;
    }

    public BinaryTree( int inputId, char inputData ) {
        root = new BinaryTreeNode(inputId, inputData);
    }

    public BinaryTreeNode search( int id ) {
        BinaryTreeNode current = root;

        while ( current != null ) {
            if ( id == current.id ) {
                    return current;
            }
            if ( id < current.id ) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
        }
        return null;

    }

    public void insert( int id, char data ) {
        BinaryTreeNode newNode = new BinaryTreeNode( id, data );

        BinaryTreeNode current = root;
        BinaryTreeNode parent;

        while( current != null ){
            parent = current;
            if ( id < current.id ) {
                current = current.leftChild;

                if ( current == null ) {
                    parent.leftChild = newNode;
                    return;
                }
            } else {
                current = current.rightChild;
                if ( current == null ) {
                    parent.rightChild = newNode;
                    return;
                }
            }

        }
    }

    public void traverseInOrder( BinaryTreeNode current ) {
        if ( current != null ) {
            traverseInOrder( current.leftChild );

            // can do something here
            System.out.println( current.id + ": " + current.data );

            traverseInOrder( current.rightChild );
        }
    }

    public void traverseInPreOrder( BinaryTreeNode current ) {
        if ( current != null ) {
            // can do something here
            System.out.println( current.id + ": " + current.data );

            traverseInOrder( current.leftChild );

            traverseInOrder( current.rightChild );
        }
    }

    public void traverseInPostOrder( BinaryTreeNode current ) {
        if ( current != null ) {

            traverseInOrder( current.leftChild );

            traverseInOrder( current.rightChild );

            // can do something here
            System.out.println( current.id + ": " + current.data );
        }
    }

    public BinaryTreeNode minimum() {
        BinaryTreeNode current = root;
        BinaryTreeNode last = null;


        while( current != null ) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public BinaryTreeNode maximum() {
        BinaryTreeNode current = root;
        BinaryTreeNode last = null;


        while( current != null ) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }



}