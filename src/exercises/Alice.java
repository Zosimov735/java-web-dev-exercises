package exercises;

import java.util.Scanner;
public class Alice {
    public static void main(String[] args){
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once" +
                "or twice she had peeped into the book " +
                "her sister was reading, but it had no pictures or conversations in it," +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        sentence = sentence.toLowerCase();


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term to search for: ");
        String userValue = input.nextLine();
        userValue = userValue.toLowerCase();
        boolean sentenceCheck = sentence.contains(userValue);
        int userValueIndex = sentence.indexOf(userValue);
        int userValueLength = userValue.length();
        System.out.println(userValueIndex + " " + userValueLength);
        String sentenceReplaced = sentence.replace(userValue, "");
        System.out.print(sentenceReplaced.trim());
    }
}
