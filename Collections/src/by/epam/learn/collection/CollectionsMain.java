package by.epam.learn.collection;

import java.util.*;

public class CollectionsMain {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<String>() {
            {
                this.add("One");
                this.add("Two");
            }
        };
        System.out.println(stringSet);

        List<Integer> intList = new ArrayList<>() {
            {
                this.add(1);
                this.add(2);
                this.add(4);
                this.add(5);
                this.add(null);
            }
        };
        System.out.println(intList);
        intList.remove(intList.indexOf(4));
        System.out.println(intList);

        Queue<String> queue = new LinkedList<>(){
            {
                this.offer("Kirill");
                this.offer("Petr");
                this.offer("Ivan");

            }
        };
    }
}
