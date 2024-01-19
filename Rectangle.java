public class Rectangle implements Shape {
    private int m_width;
    private int m_height;

    public Rectangle(int width, int height) {
        m_width = width;
        m_height = height;
    }

    @Override
    public double calculateArea() {
        return m_width * m_height;
    }

    @Override
    public double calculatePerimeter() {
        return m_width * 2 + m_height * 2;
    }
}
