public class WordTool {
    static final int MAX_CHAR = 256;

    WordTool() {};

    public int wordCount ( String s ) {
        int count = 0;  // variable to count words

        // if the entry is empty or is null, count is zero
        // therefore we evaluate it only otherwise
        if ( !(s == null || s.isEmpty()) ) {
            // use the split method from the String class to
            // separate the words having the whitespace as separator
            String[] w = s.split("\\s+");
            count = w.length;
        }

        return count;
    }

    public int symbolCount ( String s, boolean withSpaces ) {
        int count = 0;  // variable to count symbols

        // if the entry is empty or is null, count is zero
        // therefore we evaluate it only otherwise
        if ( !(s == null || s.isEmpty()) ) {
            if (withSpaces) {
                // with whitespaces return the full length
                count = s.length();
            } else {
                // without whitespaces, eliminate whitespaces
                // and get the length on the fly
                count = s.replace(" ", "").length();
            }
        }

        return count;
    }
    public static void countOccurringChar(String str) {
        int count[] = new int[MAX_CHAR];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        char ch[] = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            int find = 0;

            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == ch[j])
                    find++;
            }
            if (find == 1) {
                System.out.println("The occurrence of "+ str.charAt(i)+ " is: " + count[str.charAt(i)]);
            }
        }
    }



    public static void main(String[] args) {
        WordTool wt = new WordTool();
        String str = "The river carried the memories from her childhood.";


        System.out.println( "Analysing the text: \n" + str );
        System.out.println( "Total words: " + wt.wordCount(str) );
        System.out.println( "Total symbols (w. spaces): " + wt.symbolCount(str, true) );
        System.out.println( "Total symbols (wo. spaces): " + wt.symbolCount(str, false) );
        countOccurringChar(str);

    }
}