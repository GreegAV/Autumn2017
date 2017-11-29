package Lesson_20171124;

import static Lesson_20171124.TestExceptions.*;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Test NullPointerException");
        testException();
        System.out.println();

        System.out.println("Test ArithmeticException");
        npeCatcher();
        System.out.println();

        System.out.println("Контролируемое исключение.");
        System.out.println("Параметры ОК, ошибки не появляется. ");
        controlledException(5, 1);
        System.out.println();
        System.out.print("А теперь параметры не ОК и получаем : ");
        controlledException(5, 10);
        System.out.println();

        System.out.println("Моделируемый StackOverflowError");
        sofError();
        System.out.println();

        System.out.println("Моделируемый OutOfMemoryError");
        oomError();
        System.out.println();


    }
}
