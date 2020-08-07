package by.epam.learn.collection;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return '\n' + "Person { " +
                "name='" + name + '\'' +
                ", age=" + age +
                " }";
    }

    @Override
    public int compareTo(Person o) {
        int sortResult = age - o.age;
        if (sortResult > 0) {
            return 1;
        } else if (sortResult < 0) {
            return -1;
        }
        return 0;
    }
}
