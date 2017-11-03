package les04.les04hw.Numbers2;

import java.util.ArrayList;

import static les04.les04hw.Numbers2.Staff.*;

public class Runner {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = genArray();

        System.out.println("Общее количество чисел в массиве: " + colNumber(arrayList));

        System.out.println("Максимальное число: " + maxNumber(arrayList));

        System.out.println("Минимальное число: " + minNumber(arrayList));

        System.out.println("Среднее значение: " + avgNumber(arrayList));

    }
}
