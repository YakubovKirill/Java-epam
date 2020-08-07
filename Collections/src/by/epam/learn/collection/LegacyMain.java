package by.epam.learn.collection;

import java.util.Hashtable;

public class LegacyMain {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);
        hashtable.compute("OneKey", (k, v) -> 10);
        System.out.println(hashtable);
    }
}
