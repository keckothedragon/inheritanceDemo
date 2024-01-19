public class Circle implements Shape {
    private double m_radius;

    public Circle(double radius) {
        m_radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(m_radius, 2);
    }

    public double calculatePerimeter() {
        return Math.PI * 2 * m_radius;
    }
}
