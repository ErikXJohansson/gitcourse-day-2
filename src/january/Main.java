package january;

public class Main {

    public static void main(String[] args) {
        int num = 10;
        increment(num);
        System.out.println(num);
        decrement(num);
        System.out.println(num);

    }

    public static int increment(int number) {
        return ++number;
    }

    public static int decrement(int number) {
        return --number;
    }
}
