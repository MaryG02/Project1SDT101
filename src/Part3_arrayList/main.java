package Part3_arrayList;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // ArrayList for Strings
        ArrayList<String> words = new ArrayList<String>();

        words.add("book");
        words.add("pen");
        words.add("orange");
        words.add(1, "apple");

        // USe get
        String first = words.get(1);
        System.out.println("First element: " + first);

        // Use set
        words.set(0, "table");

        // Use remove
        words.remove(3);

        // Use addAll
        ArrayList<String> otherWords = new ArrayList<String>();
        otherWords.add("dog");
        otherWords.add("cat");
        words.addAll(otherWords);

        // Use indexOf
        int index = words.indexOf("pen");
        System.out.println("Index of pen: " + index);



        System.out.println("Elements in the list (enhanced for loop):");
        for (String i : words) {
            System.out.println(i);
        }


        System.out.println("Elements in the list (regular for loop):");
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }

        // ArrayList for Integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(13);
        numbers.add(18);
        numbers.add(11);
        numbers.add(1, 15);

        // Use get
        int second = numbers.get(2);
        System.out.println("Second element is: " + second);

        // Use set
        numbers.set(0, 5);

        // Use remove
        numbers.remove(2);

        // Use addAll
        ArrayList<Integer> otherNumbers = new ArrayList<Integer>();
        otherNumbers.add(41);
        otherNumbers.add(33);
        numbers.addAll(otherNumbers);

        // Use indexOf
        int indexInt = numbers.indexOf(11);
        System.out.println("Index of integer 11: " + indexInt);


        System.out.println("Elements in the list (enhanced for loop):");
        for (Integer k : numbers) {
            System.out.println(k);
        }

        System.out.println("Elements in the list (regular for loop):");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}



