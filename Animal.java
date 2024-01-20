public class Animal {
    public String m_name;

    public Animal(String name) {
        m_name = name;
        int a = 4;
    }

    public void sayMyName() {
        System.out.println(m_name);
    }

    public void talk() {
        System.out.println("*animal noises*");
    }
}
