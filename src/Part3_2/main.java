package Part3_2;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Bob");
        names.add("Chris");
        names.add("Eve");
        System.out.println("List of names: " + names);
        insertName(names, "Tom");
        System.out.println("List after inserting new name: " + names);


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println("List of integers: " + numbers);
        arrayListRemove(numbers, 5);
        System.out.println("List after removing: " + numbers);

    }

    public static void insertName(ArrayList<String> list, String name) {
        int i = 0;
        while (i< list.size() && name.compareTo(list.get(i)) > 0) {
            i++;
        }
        list.add(i, name);
    }

    public static void arrayListRemove(ArrayList<Integer> list, int value) {
        int i = 0;
        while (i<list.size()){
            if (list.get(i) == value){
                list.remove(i);
            }
            else{
                i++;
            }
        }
    }



}