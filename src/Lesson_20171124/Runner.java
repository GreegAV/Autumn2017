package Lesson_20171124;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Test NPE exception");
        testExceptions.testException();
        System.out.println();

        System.out.println("Test ArithmeticException");
        testExceptions.npeCatcher();
        System.out.println();


    }
}
