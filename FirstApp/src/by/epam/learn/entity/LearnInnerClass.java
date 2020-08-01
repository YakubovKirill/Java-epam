package by.epam.learn.entity;

public class LearnInnerClass {
    private String stringField1;
    private String stringField2;
    private int intField1;
    private int intField2;
    private Subclass sub;

    public class Subclass {
        private String subStringField1;
        private String subStringField2;
        private int subIntField1;
        private int subIntField2;
    }

    public String getSubStringField1 () {
        return sub.subStringField1;
    }

    public void setClassInMethod () {
        class MethodClass {
            public MethodClass () {
                System.out.println("Hello from constructor class in method");
            }
        }
        MethodClass mc = new MethodClass();
    }
}
