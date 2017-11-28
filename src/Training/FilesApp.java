package Training;

import java.io.*;

public class FilesApp {

    public static void main(String[] args) {

        String s1 = "Привет мир!";
        String s2="Hello World!";
        try(PrintStream printStream = new PrintStream("notes.txt"))
        {
            printStream.println(s1);
            int i=2;
            printStream.printf("Квадрат числа %d равен %d \n", i, i*i);
            byte[] s2_toBytes = s2.getBytes();
            printStream.write(s2_toBytes);
            printStream.println("Конец");
            System.out.println("Запись в файл произведена");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}