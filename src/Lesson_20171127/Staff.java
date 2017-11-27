package Lesson_20171127;

import javax.swing.*;
import java.io.*;

public class Staff {
    private static JFileChooser fc;

    static String getFileName() {
        fc = new JFileChooser();
        String path = null;
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = fc.showOpenDialog(fc);

        if (returnVal < 1) {
            File file = fc.getSelectedFile();
            path = file.getPath();
        } else {
            System.exit(0);
        }
        return path;
    }


    static void charCompare() {
        int offsetDifference = 0;
        boolean different=false;

        System.out.println("Выберите первый файл для сравнения : ");
        String fname1 = getFileName();
        System.out.println("Выберите второй файл для сравнения : ");
        String fname2 = getFileName();

        try {
            Reader file1 = new BufferedReader(new FileReader(fname1));
            Reader file2 = new BufferedReader(new FileReader(fname2));

            long filesize1 = new File(fname1).length();
            long filesize2 = new File(fname2).length();

            if (filesize1 > 0 && filesize2 > 0) {
                int c1 = file1.read();  //первый символ первого файла
                int c2 = file2.read();  //первый симовл второго файла
                System.out.println((char) c1+" - "+(char) c2);
                if (c1==c2){
                    offsetDifference++;
                    while ((c1 != -1) && (c2 != -1) && !different) {
                        c1 = file1.read();
                        c2 = file2.read();
                        System.out.println((char) c1+" - "+(char) c2);
                        if (c1==c2) {
                            offsetDifference++;
                        }
                        else {
                            different=true;
                        }
                    }

                } else {
                    // do nothing
                }
            }

            System.out.print("- Результаты сравнения для файлов " + fname1 + " и " + fname2 + " :");
            if (offsetDifference == 0) {
                System.out.println(" различий не обнаружено");
            } else {
                System.out.println("\n- размеры файлов: " + fname1 + " - " + filesize1 + " Байт, " + fname2 + " - " + filesize2 + " Байт");
                System.out.println("- первое отличие найдено на: " + (offsetDifference+1));
                System.out.println("- общее количество отличающихся байт в первом файле: " + (filesize1 - offsetDifference-1));
            }
        } catch (IOException e) {
            System.out.println("Странно... " + e.toString());
        }
    }

    static void byteCompare() {

    }
}
