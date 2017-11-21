package Lesson_20171120;

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
public class Staff {

    //выводит количество букв в строке
    public static int countLetters(String string) {
        return string.length();
    }

    // сравнивает данную строку с любой другой, игнорируя регист
    public static boolean compareString(String srcString, String compString) {
        return srcString.equalsIgnoreCase(compString);
    }

    //все буквы к верхнему/нижнему регисту и выводит результат
    public static String toLowerString(String string) {
        return string.toLowerCase();
    }

    // все буквы к верхнему/нижнему регисту и выводит результат
    public static String toUpperString(String string) {
        return string.toUpperCase();
    }

    // выводит на консоль все индексы слова "dong"
    public static String stringIndexes(String string, String searchString) {
        String result="";
        String tempString=string.toLowerCase();
        searchString=searchString.toLowerCase();
        int coursor=0;

        while (tempString.indexOf(searchString)>=0) {
            result+=coursor+tempString.indexOf(searchString)+" ";
            coursor+=tempString.indexOf(searchString)+searchString.length();
            tempString=string.substring(coursor,string.length());
        }
        return result;
    }

    // заменяет каждое вхождение слова dong на bong
    public static String replaceSubStr(String srcString, String searchStr, String replaceStr) {
//        String result="";
//        if (srcString.indexOf(searchStr)>=0) {
//            while (srcString.indexOf(searchStr)>=0){
//                result+=srcString.substring(0,srcString.indexOf(searchStr));
//                result+=replaceStr;
//                srcString=srcString.substring(srcString.indexOf(searchStr)+searchStr.length(),srcString.length());
//            }
//        }
//        return result;
        return srcString.replace(searchStr,replaceStr);
    }

    // находит все одинаковые слова, подсчитывая их количество
    public static int countWords(String string, String searchString) {
        int count=0;
        string=string.toLowerCase();
        searchString=searchString.toLowerCase();
        while (string.indexOf(searchString)>=0) {
            count++;
            string=string.substring(string.indexOf(searchString)+searchString.length());
        }
        return count;
    }

}
