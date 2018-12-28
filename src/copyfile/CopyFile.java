package copyfile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CopyFile {

    public static void main(String[] args) {
        try {
            System.out.println("Путь к файлу копирования : ");
            Scanner scanR=new Scanner(System.in);
            String pathRead=scanR.next();
            File FileRead= new File(pathRead);
            System.out.println("Путь для копии файла : ");
            Scanner scanW=new Scanner(System.in);
            String pathWrite=scanW.next();
            File FileWrite= new File(pathWrite);
            Copy  сopy=new Copy ();
            сopy.ReadWrite(pathRead,pathWrite);
            System.out.println("OK");
        } catch (IOException ex) {
            Logger.getLogger(CopyFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

