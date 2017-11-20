package Lesson_20171120;

import static Lesson_20171120.Staff.*;
/**
 Создайте программу, которая преобразовывает в строке "Dong-ding-
 dong"

  выводит количество букв в строке
  сравнивает данную строку с любой другой, игнорируя регист
  все буквы к верхнему/нижнему регисту и выводит результат
 на консоль
  выводит на консоль все индексы слова "dong"
  заменяет каждое вхождение слова dong на bong
  находит все одинаковые слова, подсчитывая их количество
 */
public class Runner {

    public static void main(String[] args) {
        String str="Dong-ding-dong";
        String newStr="АБЫРВАЛГ";

        System.out.println(countLetters(str));
        System.out.println(compareString(str, newStr));


    }


}
