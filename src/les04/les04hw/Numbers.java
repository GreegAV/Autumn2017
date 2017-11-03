package les04.les04hw;

import java.util.Scanner;

/**
 * Created by avg-m on 01/11/2017.
 */
public class Numbers {
    // 1. Дано целое число a. Определить число вхождений в него цифры b.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Число-база: ");
        int baseNumber = scn.nextInt();

        System.out.print("Цифра для поиска: ");
        int searchNumber = scn.nextInt();

        while (searchNumber > 9 || searchNumber < 0) {
            System.out.println("Введите цифру от 0 до 9 включительно. ");
            System.out.print("Цифра для поиска: ");
            searchNumber = scn.nextInt();
        }
        int enters = 0;
        int rest=0;
        if ( baseNumber == searchNumber ) {
            enters++;
        } else {

//            rest = baseNumber - (baseNumber / 10) * 10;
//            baseNumber /= 10;
//            System.out.println("rest :" + rest);
//            System.out.println("basenumber :" + baseNumber);
//            if ( rest == searchNumber ) {
//                enters++;
//            }


            do {
                baseNumber /= 10;
                rest = baseNumber - (baseNumber / 10) * 10;
                System.out.println("rest :" + rest);
                System.out.println("basenumber :" + baseNumber);
                if ( rest == searchNumber  ) {
                    enters++;
                }
            } while (baseNumber > searchNumber);
        if ( baseNumber == searchNumber ) {
            enters++;
        }
        }
        System.out.println("Final enters :" + enters);
    }
}
