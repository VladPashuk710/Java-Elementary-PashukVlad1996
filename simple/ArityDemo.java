package simple;

import java.util.Random;

public abstract class ArityDemo implements ExceptionDemo {

    public static void main(String[] args) {
        int a=0, b=0, c=0;
        Random r = new Random();
            for(int i = 0; i < 32000; i++) {
                try {
                    b = r.nextInt(200);
                    c = r.nextInt(300);
                    a = 10000/b/c;
                }
                catch(ArithmeticException e) {
                    System.out.println("Деление на ноль!");
                    a = 0;
                }
                    System.out.println("a = "+a);
            }
    }
}
