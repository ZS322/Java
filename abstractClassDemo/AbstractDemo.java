package abstractClassDemo;

public class AbstractDemo {
    public static void main(String[] args) {

        Salary s = new Salary("One", "1", 1, 11);

        Employee e = new Salary("TWO", "1A", 2, 22);

        s.mailCheck();

        e.mailCheck();
    }
}
