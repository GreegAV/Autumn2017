package les04.les04hw.Numbers2;
/*
Напишите приложение, которое получает в качестве данных ввода
ряд чисел. В конце перечисления данных ввода программа должна
выводить общее число введенных чисел, наибольшее число,
наименьшее число и среднее всех чисел.

 */

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
