package Lesson_20171101.les04hw.Numbers4;

public class Staff {

    public static void printRight(int count) {
        for (int i = 1; i < count; i++) {
            for (int j = count; j > 0; j--) {
                if (i < j) {
                    System.out.print("  ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void printLeft(int count) {
        for (int i = 0; i < count; i++) {
            for (int f = i - 1; f >= 0; f--) {
                System.out.print(f + " ");
            }
            System.out.println();

        }
    }
}
