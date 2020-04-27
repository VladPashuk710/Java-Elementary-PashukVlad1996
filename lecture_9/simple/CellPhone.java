package lecture_9.simple;

import lecture_9.simple.specs.Phone;

public abstract class CellPhone implements Phone {
    public void call() {
        System.out.println("Phone calling");
    }
}
