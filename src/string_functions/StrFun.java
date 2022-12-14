package string_functions;

import java.sql.SQLOutput;
// Always compare with word.equals(word2); not == which is memory location
public class StrFun {
    public static void main(String[] args) {
        String text = "flabbergast";
        // good for json or query
        String textBlock = """
                Hey yall
                How is ya!
                """;
        System.out.println(textBlock);
        reverseString(text);
    }
    public static void countWords(String text){
        String[] words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("You text containts %d words", numberOfWords);
        System.out.println(message);
        for(String w: words){
            System.out.println(w);
        }
    }
    public static void reverseString(String word){
        for(int i = word.length()-1; i >=0;i--){
            System.out.print(word.charAt(i));
        }
    }

}
