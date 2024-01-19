public class Cat extends Animal {
    public int m_furballs;

    public Cat(String name, int furballs) {
        super(name);

        m_furballs = furballs;
    }

    public void furball() {
        m_furballs++;
        System.out.println(String.format("*hack* *cough* (%d)", m_furballs));
    }

    @Override
    public void talk() {
        System.out.println("Meow");
    }
}
