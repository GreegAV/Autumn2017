package Lesson_20171124;

import static Lesson_20171124.TestExceptions.*;

public class Runner {
    public static void main(String[] args) {

        TestExceptions testExceptions=new TestExceptions();

        System.out.println("Test NPE exception");
        testException();
        System.out.println();

        System.out.println("Test ArithmeticException");
        npeCatcher();
        System.out.println();

        System.out.println("Контролируемое исключение.");
        controlledException(5,1);
        System.out.println();

        System.out.println("Моделируемый StackOverflowError");
        sofError();
        System.out.println();

        System.out.println("Моделируемый OutOfMemoryError");
        oomError();
        System.out.println();





    }
}
