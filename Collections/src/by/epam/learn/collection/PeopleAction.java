package by.epam.learn.collection;

import java.util.Iterator;
import java.util.List;

public class PeopleAction {
    public void twentyAction (List<Person> peoples) {
        Iterator<Person> iterator = peoples.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getAge() < 20) {
                iterator.remove();
            }
        }
    }
}
