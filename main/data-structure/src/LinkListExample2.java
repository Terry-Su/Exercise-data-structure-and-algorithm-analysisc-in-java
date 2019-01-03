public class LinkListExample2 {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.insertFirst( 10, 'a' );
        linkList.insertFirst( 20, 'b' );
        linkList.insertFirst( 30, 'c' );
        linkList.insertFirst( 40, 'd' );
        linkList.insertFirst( 50, 'e' );

        linkList.display();
        System.out.println(" ");

        Link found = linkList.findById(20);
        System.out.println("Found link with id: " + found.id);
        found.display();

        Link deleted = linkList.deleteById(40);
        System.out.println("Deleted link with id: " + deleted.id);
        deleted.display();
    }
}
