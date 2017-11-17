package les02;

/**
 * Created by avg-m on 27/10/2017.
 */
public class Lesson2 {
    public static void main(String[] args) {

        System.out.println("20/6 :" + 20 / 6);
        System.out.println("20%6 :" + 20 % 6);
        System.out.println("-20/6 :" + -20 / 6);
        System.out.println("-20%-6 :" + -20 % -6);
        System.out.println("20/-6 :" + 20 / -6);
        System.out.println("20%-6 :" + 20 % -6);
        System.out.println("-20/-6 :" + -20 / -6);
        System.out.println("-20%6 :" + -20 % 6);
        System.out.println();

        System.out.println("Записать выражение");
        int x = 5;
        System.out.println("1) изменяющее знак значения переменной x\n" +
                "Пример: x=5, -x= " + -x);
        int a = 2;
        System.out.println("2) удваивающее значение переменной а\n" +
                "Пример: a=2, удвоенное a=" + 2 * a);
        int i = 1;
        System.out.println("3) увеличивающее значение переменной i на 1\n" +
                "Пример: i=1, увеличенное на 1: i= " + ++i);
        int t = 1;
        System.out.println("4) увеличивающее значение переменной увеличенное на 2\n" +
                "Пример: t=1, Удвоенное = " + t * 2);
        int c = 12345;
        System.out.println("5) для вычисления третьей от конца цифры в десятичной записи положительного целого числа\n" +
                "Например 12345\n" +
                "Третья цифра " + c % 1000 / 100);
    }

}
