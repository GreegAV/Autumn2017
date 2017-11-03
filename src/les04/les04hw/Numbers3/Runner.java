package les04.les04hw.Numbers3;

import static les04.les04hw.Numbers3.Staff.*;

/*
Напишите приложение, которое определяет через сколько целых лет
вложенная в банк сумма s под n процентов годовых достигнет
заданного значения. Можно ли в ней использовать цикл с
постусловием? Перепишите ее для всех возможных видов циклов.
Можно ли для завершения расчета накопленной суммы
использовать оператор break, break с меткой, return? Вызов
System.exit() ? Убедитесь в этом.

 */
public class Runner {
    public static void main(String[] args) {

        System.out.println("Введите сумму депозита (целое число).");
        int sumDepo = sumDepo();

        System.out.println("Введите размер процентов (целое число).");
        double percentNum = percentNum();

        System.out.println("Введите желаемую сумму (целое число).");
        int desiredSum = desiredSum();

        int timeDepo = timeDeposit(sumDepo, percentNum, desiredSum);
        if (timeDepo > 0) {
            System.out.println("Вам необходимо положить депозит на " + timeDepo + " месяцев.");
        }
    }
}
