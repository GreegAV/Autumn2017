package Lesson_20171122;

/**
 * Created by avg-m on 22/11/2017.
 */
public class Runner {
    public static void main(String[] args) {
     try {
         throw new ArithmeticException();
     }
     catch (Exception e) {
         System.out.println("catch");
      //   e.printStackTrace();
     }
     finally {
         System.out.println("Finally!");
     }
    }
}
