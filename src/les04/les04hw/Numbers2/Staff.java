package les04.les04hw.Numbers2;

import java.util.ArrayList;
import java.util.Scanner;

public class Staff {

    public static ArrayList<Integer> genArray() {
        ArrayList<Integer> numArray = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите числа в массив. Для окончания ввода введите exit");
        String newItem = scn.nextLine();
        while (!newItem.equalsIgnoreCase("exit")) {
            numArray.add(Integer.parseInt(newItem));
            newItem = scn.nextLine();
        }
        return numArray;
    }

    public static int minNumber(ArrayList<Integer> testArray) {
        int minNum = testArray.get(0);

        for (int testNum : testArray) {
            if (testNum < minNum) {
                minNum = testNum;
            }
        }
        return minNum;
    }

    public static int maxNumber(ArrayList<Integer> testArray) {
        int maxNum = testArray.get(0);

        for (int testNum : testArray) {
            if (testNum > maxNum) {
                maxNum = testNum;
            }
        }
        return maxNum;
    }

    public static double avgNumber(ArrayList<Integer> testArray) {
        double sum = 0;

        for (int testNum : testArray) {
            sum += testNum;
        }

        double avgNum = sum / colNumber(testArray);
        return avgNum;
    }

    public static int colNumber(ArrayList<Integer> testArray) {
        int colNum = 0;

        for (int testNum : testArray) {
            colNum++;
        }
        return colNum;
    }
}
