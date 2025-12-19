class Demo {

    int sum;

    void add(int a, int b) {
        sum = a + b;
        System.out.println(sum);
    }
}

public class ExampleMethod2 {
    public static void main(String[] args) {

        Demo d = new Demo();
        d.add(10, 20);
    }
}
