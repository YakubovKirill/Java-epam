package by.epam.learn;

import java.util.HashSet;
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
    }
}
