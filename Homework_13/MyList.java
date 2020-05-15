package Homework_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyList implements ListApp {

    public static void main(String[] args) {

        //Создать объект List с использованием объекта ArrayList,
        // заполнить его произвольными даннами типа int,
        // вывести содержимое списка на экран,
        // отсортировать элементы по возрастанию,
        // вывести содержимое списка на экран,
        // разупорядочить массив (метод Collection.shuffle()),
        // вывести соддержимое на экран.

        if(args.length == 0) {
            args = new String[2];
            args[0] = "10";
            args[1] = "1000";
        }
            else {
                args[0] = "1";
                args[1] = "100";
        }

        int itemsCount = Integer.parseInt(args[0]);
        int maxRandomValue = Integer.parseInt(args[1]);

        List<Integer> myList = new ArrayList<Integer>();
        Random rand = new Random();

            for(int i = 1; i < itemsCount; i++) {
                myList.add(new Integer(rand.nextInt(maxRandomValue)));
            }

        System.out.println("Filled: " +myList);

        Collections.sort(myList);
        System.out.println("Sorted: " +myList);

        Collections.shuffle(myList);
        System.out.println("Shuffled: " +myList);
    }

    @Override
    public int add() {
        return 0;
    }

    @Override
    public int sort() {
        return 0;
    }

    @Override
    public int shuffle() {
        return 0;
    }
}
