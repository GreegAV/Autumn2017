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

    static void charCompare (){
        System.out.println("Выберите первый файл для сравнения : ");
        String fname1=getFileName();
        System.out.println("Выберите второй файл для сравнения : ");
        String fname2=getFileName();
        try {
            Reader file1 = new BufferedReader(new FileReader(fname1));
            Reader file2 = new BufferedReader(new FileReader(fname2));
        } catch (FileNotFoundException e)
        {
            System.out.println("Странно... "+e.toString());
        }

    }

    static void byteCompare() {

    }
}
