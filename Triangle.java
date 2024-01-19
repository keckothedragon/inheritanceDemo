public class Triangle implements Shape {
    private double m_side1;
    private double m_side2;
    private double m_side3;
    private double m_height;

    public Triangle(double side1, double side2, double side3, double height) {
        m_side1 = side1;
        m_side2 = side2;
        m_side3 = side3;
        m_height = height;
    }

    public double calculateArea() {
        return 0.5 * m_side1 * m_height;
    }

    public double calculatePerimeter() {
        return m_side1 + m_side2 + m_side3;
    }
}
