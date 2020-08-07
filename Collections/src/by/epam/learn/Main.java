package by.epam.learn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
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
    }
}
