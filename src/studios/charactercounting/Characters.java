package studios.charactercounting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Characters {
    public static void main(String[] args){
        HashMap<Character, Integer> chars = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String sentence = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charsInString = sentence.toCharArray();
        Character letter;
        Integer charCount = 0;
        Integer incrementByOne = 1;
        for (Integer i = 0; i<charsInString.length; i++){
            letter = charsInString[i];
            Integer howManyChar;
            if (!chars.containsKey(letter)) {
                chars.put(letter, 1);
            }
            else{
                Integer increm = chars.get(letter);
                chars.replace(letter, increm + 1);
            }
            }
        System.out.println(chars);
        }

    }

