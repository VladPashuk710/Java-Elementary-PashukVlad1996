package simple;

import java.util.Random;

abstract public class CatchDemo implements ExceptionDemo {

    public static void main(String[] args) {
        Random r = new Random();
        int A[] = {0,2};
        int a,b;
            for(int i = 0; i < 10; i++) {
                try {
                    a = r.nextInt(3);
                    b = 10 / A[a];
                    System.out.println(b);
                }
                catch (ArithmeticException e) {
                    System.out.println("Деление на ноль!");
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Выход за пределы массива!");
                }
                finally {
                    System.out.println("******************************");
                }
            }
    }
}
