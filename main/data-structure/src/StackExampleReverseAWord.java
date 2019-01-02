public class StackExampleReverseAWord {
    public static void main(String[] args) {
        System.out.println( init("stack example!") );
    }

    private static String init( String word ) {
        int wordLength = word.length();
        Stack stack = new Stack( wordLength );

        for(int i = 0; i <= wordLength - 1; i++) {
            stack.push( word.charAt(i) );
        }

        String result = "";

        while( !stack.isEmpty() ) {
            result = result + stack.pop();
        }

        return result;
    }
}
