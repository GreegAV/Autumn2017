package Lesson_20171124;

public class testExceptions {

    public static void testException() {
        Object object=null;
        try {
            object.toString();
        } catch (Exception e) {
            System.out.print("Beloved NPE :");
            System.out.println(e.toString());
        }
    }

    private static void npe() throws NullPointerException {
        int q=0;
        int a=0;
        int z = a/q;
    }

    public static void npeCatcher() {
        try {
            npe();
        } catch(ArithmeticException e) {
            System.out.print("Получили :");
            System.out.println(e.toString());
        } finally {
            System.out.println("На ноль делить нельзя!(c)");
        }
    }
}
