public interface Shape {
    double area();
}

public class Rectangle implements Shape {
    private double length;
    private double width;

    // constructor, getters, and setters

    @Override
    public double area() {
        return length * width;
    }
}

public class Circle implements Shape {
    private double radius;

    // constructor, getters, and setters

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
