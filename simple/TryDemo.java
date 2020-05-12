package simple;

import java.util.Random;

abstract public class TryDemo implements ExceptionDemo {

    public static void main(String[] args) {
        Random r = new Random();
        int a, b;
        int c[] = {-1, 1};
        for (int i = 0; i < 10; i++) {
            try {
                a = r.nextInt(3);
                b = 100 / a;
                    System.out.println("b = " + b);
                try {
                    if (a == 1)
                        a = a / (a - 1);
                    else c[a] = 300;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("" + e);
                }
                    } catch (ArithmeticException e) {
                    System.out.println("" + e);
                }
                    System.out.println("**********************");
        }
    }
}
