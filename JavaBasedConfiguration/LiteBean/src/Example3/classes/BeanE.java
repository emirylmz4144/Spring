package Example3.classes;

public class BeanE {

    private String name;
    private int number;

    public BeanE(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "BeanE [name=" + name + ", number=" + number + "]";
    }
}
