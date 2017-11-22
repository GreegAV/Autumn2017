package Lesson_20171120;

import static Lesson_20171120.Staff.*;

/**
 * Создайте программу, которая преобразовывает в строке "Dong-ding-
 * dong"
 * <p>
 *  выводит количество букв в строке
 *  сравнивает данную строку с любой другой, игнорируя регист
 *  все буквы к верхнему/нижнему регисту и выводит результат
 * на консоль
 *  выводит на консоль все индексы слова "dong"
 *  заменяет каждое вхождение слова dong на bong
 *  находит все одинаковые слова, подсчитывая их количество
 */
public class Runner {

    public static void main(String[] args) {
        String str = "Dong-ding-dong-dong";
        String newStr = "dong";
        String newStr2 = "bong";

        System.out.println("Исходная строка: " + str);
        System.out.println("Длина строки : " + countLetters(str) + " символов.");
        System.out.println("Строка " + newStr + (compareString(str, newStr) ? " равна" : " не равна") + " исходной.");
        System.out.println("В нижнем регистре: " + toLowerString(str));
        System.out.println("В верхнем регистре: " + toUpperString(str));

        if (stringIndexes(str, newStr).length() > 0) {
            System.out.println("Подстрока " + newStr + " начинается с позиций: " + stringIndexes(str, newStr));
        } else
            System.out.println("Подстрока " + newStr + " в исходной строке не найдена.");

        if (replaceSubStr(str, newStr, newStr2).length() > 0) {
            System.out.println("Строка после замен :" + replaceSubStr(str, newStr, newStr2));
        } else
            System.out.println("Подстрока " + newStr + " в исходной строке не найдена. Заменять нечего.");

        System.out.println("Одинаковых слов в строке :" + countWords(str, newStr));

    }


}
