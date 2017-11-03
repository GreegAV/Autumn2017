package les04.les04hw.Numbers1;

import java.util.ArrayList;
import java.util.Scanner;

public class Staff {
    public static void enterNum() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Число-база: ");
        long baseNumber = scn.nextLong();
        long baseNumberBackup=baseNumber;

        System.out.print("Цифра для поиска: ");
        int searchNumber = scn.nextInt();

        while (searchNumber > 9 || searchNumber < 0) {
            System.out.println("Введите цифру от 0 до 9 включительно. ");
            System.out.print("Цифра для поиска: ");
            searchNumber = scn.nextInt();
        }

        int enters = 0;

        ArrayList<Integer> integers = new ArrayList<>();

        while (baseNumber > 0) {
            integers.add(0, (int) baseNumber % 10);
            baseNumber /= 10;
        }
        for (int testNum : integers) {
            if (testNum == searchNumber) {
                enters++;
            }
        }

        System.out.println("Вхождение цифры " + searchNumber + " в " + baseNumberBackup + " - " + enters + " раз.");
    }
}
