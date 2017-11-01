package les04.les04hw;

import java.util.Scanner;

/**
 * Created by avg-m on 01/11/2017.
 */
public class Numbers {
    // 1. Дано целое число a. Определить число вхождений в него цифры b.
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Число-база: ");
        long baseNumber=scn.nextLong();

        System.out.println("Число для поиска: ");
        int searchNumber = scn.nextInt();
        while (searchNumber>9) {
            System.out.println("Введите цифру от 0 до 9 включительно. "+searchNumber+">9.");
             searchNumber = scn.nextInt();
        }
         while (baseNumber%searchNumber>10){
             System.out.println(baseNumber%searchNumber);
             baseNumber%=searchNumber;
         }

    }
}
