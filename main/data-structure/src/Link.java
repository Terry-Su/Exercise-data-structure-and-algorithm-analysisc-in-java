public class Link {
    int id;
    char data;
    Link next;

    public Link( int inputId, char inputData ) {
        id = inputId;
        data = inputData;
    }

    public void display() {
        System.out.println( "{" + id + ", " + data + "}" );
    }
}
