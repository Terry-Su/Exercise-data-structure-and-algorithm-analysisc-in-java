public class StackExampleDelimiterMatching {
    public static void main(String[] args) {
        System.out.println( check( "a[b{c(d)e}f]g" ) + "\n" );
        System.out.println( check( "[(}]" ) );
    }

    public static boolean check( String input ) {
        Stack stack = new Stack( input.length() );
        for (int i = 0; i < input.length(); i++) {
            char theChar = input.charAt(i);
            switch ( theChar ) {
                case '[':
                case '{':
                case '(':
                    stack.push( theChar );
                    break;
                case ']':
                    char current1 = stack.pop();
                    if ( current1 != '[' ) {
                        printError( theChar, i );
                        return false;
                    }
                    break;
                case '}':
                    char current2 = stack.pop();
                    if ( current2 != '{' ) {
                        printError( theChar, i );
                        return false;
                    }
                    break;
                case ')':
                    char current3 = stack.pop();
                    if ( current3 != '(' ) {
                        printError( theChar, i );
                        return false;
                    }
                    break;

            }
        }
        return true;
    }

    public static void printError( char theChar, int index ) {
        System.out.println("Error: " + theChar + " at " + index);
    }
}
