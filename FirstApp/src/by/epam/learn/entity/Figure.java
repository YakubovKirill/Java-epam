package by.epam.learn.entity;

public enum Figure {
    RECTANGLE (2,3) {
        public double computeSq () {
            return this.getA() * this.getB();
        }
    },
    TRIANGLE (3,7) {
        public double computeSq () {
            return this.getA() * this.getB() / 2;
        }
    };

    Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    private double a;
    private double b;
    public abstract double computeSq (); // abstract method for calculating

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setFigure (double a, double b) {
        this.a = a;
        this.b = b;
    }
}
