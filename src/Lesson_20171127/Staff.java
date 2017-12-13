package Lesson_20171127;

//import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;

import javax.swing.*;
import java.io.*;

public class Staff {
    private static JFileChooser fc;

    public static File getFileName() {
        try {
            fc = new JFileChooser(".");
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);

            if (fc.showOpenDialog(fc) > 1) {
                System.exit(0);
            }

            File file = fc.getSelectedFile();
            return file;

        } catch (Exception e) {
            System.out.println("Файл не выбран.");
            return null;
        }
    }


    static void charCompare() {
        int offsetDifference = 0;
        boolean different = false;

        System.out.print("Выберите первый файл для сравнения : ");
        File fname1 = getFileName();
        System.out.println(fname1.getName());
        System.out.print("Выберите второй файл для сравнения : ");
        File fname2 = getFileName();
        System.out.println(fname2.getName());

        try {
            Reader file1 = new BufferedReader(new FileReader(fname1));
            Reader file2 = new BufferedReader(new FileReader(fname2));

            long filesize1 = fname1.length();
            long filesize2 = fname2.length();

            if (filesize1 > 0 && filesize2 > 0) {
                int c1 = file1.read();  //первый символ первого файла
                int c2 = file2.read();  //первый симовл второго файла
                if (c1 == c2) {
                    offsetDifference++;
                    while ((c1 != -1) && (c2 != -1) && !different) {
                        c1 = file1.read();
                        c2 = file2.read();
                        if (c1 == c2) {
                            offsetDifference++;
                        } else {
                            different = true;
                        }
                    }
                } else {
                    different = true;
                }
            }

            System.out.print("- Результаты сравнения для файлов " + fname1 + " и " + fname2 + " :");
            if (!different) {
                System.out.println(" различий не обнаружено");
            } else {
                System.out.println("\n- размеры файлов: " + fname1.getName() + " - " + filesize1 + " Байт, " + fname2.getName() + " - " + filesize2 + " Байт");
                System.out.println("- первое отличие найдено на: " + (offsetDifference + 1));
                System.out.println("- общее количество отличающихся байт в первом файле: " + (filesize1 - offsetDifference - 1));
            }
        } catch (IOException e) {
            System.out.println("Странно... " + e.toString());
        }
    }

    static void byteCompare() {
        int offsetDifference = 0;
        boolean different = false;

        System.out.print("Выберите первый файл для сравнения : ");
        File fname1 = getFileName();
        System.out.println(fname1.getName());
        System.out.print("Выберите второй файл для сравнения : ");
        File fname2 = getFileName();
        System.out.println(fname2.getName());

        try {
            InputStream fstream1 = new BufferedInputStream(new FileInputStream(fname1));
            InputStream fstream2 = new BufferedInputStream(new FileInputStream(fname2));

            long filesize1 = fname1.length();
            long filesize2 = fname2.length();

            if (filesize1 > 0 && filesize2 > 0) {
                int c1 = fstream1.read();  //первый символ первого файла
                int c2 = fstream2.read();  //первый символ второго файла
                if (c1 == c2) {
                    offsetDifference++;
                    while ((c1 != -1) && (c2 != -1) && !different) {
                        c1 = fstream1.read();
                        c2 = fstream2.read();
                        if (c1 == c2) {
                            offsetDifference++;
                        } else {
                            different = true;
                        }
                    }
                } else {
                    different = true;
                }
            }

            System.out.print("- Результаты сравнения для файлов " + fname1 + " и " + fname2 + " :");
            if (!different) {
                System.out.println(" различий не обнаружено");
            } else {
                System.out.println("\n- размеры файлов: " + fname1.getName() + " - " + filesize1 + " Байт, " + fname2.getName() + " - " + filesize2 + " Байт");
                System.out.println("- первое отличие найдено на: " + (offsetDifference + 1));
                System.out.println("- общее количество отличающихся байт в первом файле: " + (filesize1 - offsetDifference - 1));
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }


}
