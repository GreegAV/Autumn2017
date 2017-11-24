package Lesson_20171124;

public class TestExceptions {

    public static void testException() {
        Object object = null;
        try {
            object.toString();
        } catch (Exception e) {
            System.out.print("Beloved NPE :) :");
            System.out.println(e.toString());
        }
    }

    private static void npe() {
        int q = 0;
        int a = 0;
        int z = a / q;
    }

    public static void npeCatcher() {
        try {
            npe();
        } catch (ArithmeticException e) {
            System.out.print("Получили :");
            System.out.println(e.toString());
        } finally {
            System.out.println("На ноль делить нельзя!(c)");
        }
    }

    public static void controlledException(int x, int y) {
        try {
            if (x > y) {
                System.out.println("ОК, будет работать");
            } else
                throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
            // System.out.print("А нету столько! ");
            System.out.println(e.toString());
        } finally {
            System.out.println("Пересечение границ - чревато :)");
        }

    }

    public static void sofError() {
        try {
            throw new StackOverflowError();
        } catch (StackOverflowError e) {
            System.out.println("Смоделированый " + e.toString());
        }
    }

    public static void oomError() {
        try {
            throw new OutOfMemoryError();
        } catch (OutOfMemoryError e) {
            System.out.println("Смоделированый " + e.toString());
        }

    }
}
