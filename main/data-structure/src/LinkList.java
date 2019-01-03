public class LinkList {
    Link first = null;

    public void insertFirst ( int id, char data ) {
        Link link = new Link( id, data );
        link.next = first;
        first = link;
    }

    public Link deleteFirst() {
        Link res = first;
        first = first.next;
        return res;
    }

    public Link findById( int id ) {
        Link current = first;
        while( current != null ) {
            if ( current.id == id ) {
                return current;
            }
            current = current.next;
        }
        return current;
    }

    public Link deleteById( int id ) {
        if (first ==  null) {
            return null;
        }

        Link res = null;
        if ( first.id == id ) {
            res = first;
            first = null;
            return first;
        } else {
            Link current = first;
            Link next =first.next;

            while( next != null ) {
                if ( next.id == id ) {
                    current.next = next.next;
                    return next;
                }
                current = next;
                next = next.next;
            }
            return current;
        }
    }

    public void display() {
        System.out.println("List: (first-->last):");
        Link current = first;
        while( current != null ) {
            current.display();
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }
}
