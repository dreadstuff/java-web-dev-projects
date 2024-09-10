import java.util.HashMap;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String paragraph = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you've done that, it's pretty straightforward from there.";
        Scanner input = new Scanner(System.in);

        System.out.println("Tell us about your day!: ");
        String paragraph = input.nextLine();

        char[] charactersInString = paragraph.toUpperCase().toCharArray();
        HashMap<Character, Integer> paragraphChars = new HashMap<>();

        //loop through each char in array
        for (char c : charactersInString) {
            if (paragraphChars.containsKey(c)) {
                paragraphChars.put(c, paragraphChars.get(c) + 1);
            } else {
                paragraphChars.put(c, 1);
            }
//            System.out.println(paragraphChars.keySet());
        }
        for (Map.Entry<Character, Integer> c : paragraphChars.entrySet()) {
            System.out.println(c.getKey() + ": (" + c.getValue() + ")");
        }
    }
}


//example from hashmap book
//        for (Map.Entry<String, Double> student : students.entrySet()) {
//            System.out.println(student.getKey() + " (" + student.getValue() + ")");
//            sum += student.getValue();
//        }

//                System.out.println(c);