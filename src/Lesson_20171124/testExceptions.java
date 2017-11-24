package Lesson_20171124;

public class testExceptions {

    public static void testException() {
        Object object=null;
        try {
            object.toString();
        } catch (Exception e) {
            System.out.println("Beloved NPE :)");
            e.printStackTrace();
        }
    }

    private void throwException() throws NullPointerException {
        int x = 0;
        int y = 10;
        int z = y/x;
    }

    public void catchException() {
        try {
            throwException();
        } catch(ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e);
        } finally {
            System.out.println("На ноль делить нельзя!(c)");
        }
    }
}
