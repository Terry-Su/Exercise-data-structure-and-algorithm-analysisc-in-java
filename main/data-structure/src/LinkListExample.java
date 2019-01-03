public class LinkListExample {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.insertFirst( 10, 'a' );
        linkList.insertFirst( 20, 'b' );
        linkList.insertFirst( 30, 'c' );
        linkList.insertFirst( 40, 'd' );
        linkList.insertFirst( 50, 'e' );

        linkList.display();
        System.out.println(" ");

        while( ! linkList.isEmpty() ) {
            Link deleted = linkList.deleteFirst();
            System.out.println("Deleted: ");
            deleted.display();
            System.out.println(" ");
        }

        linkList.display();
    }
}
