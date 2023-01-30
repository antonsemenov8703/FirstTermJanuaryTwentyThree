package HomeWorks;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;
import java.io.FileWriter;


public class Task02_0 {

//Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
//Требуется перехватить все возможные ошибки и вывести их в логгер.
//
//После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате


    public static void LogWriter (String errors) throws IOException {

        Logger logger = Logger.getLogger(Task02_0.class.getName()); //  что делает getName , для чего он тут нужен
        FileHandler fh = new FileHandler("logger.xml", true); // true - позволяет аппендить записи, а не перезаписывать
        logger.addHandler(fh); // что делает addHandler ?? и FileHandler ??
        XMLFormatter xmlForm = new XMLFormatter();
        fh.setFormatter(xmlForm);
        logger.log(Level.INFO, errors + "\n\n");
        fh.close();
    }

    public static String GetByteNumber() throws Exception {

        System.out.println("Enter Byte number: ");
        String stringNumber = "";

        try {
            Scanner iScanner = new Scanner(System.in);
            byte byteNum = iScanner.nextByte();
            stringNumber = Byte.toString(byteNum); // для чего?
            iScanner.close();
        } catch (Exception ex) {
            LogWriter(ex.toString()); // запускаем наш модуль для записи логов
        } finally {
            System.out.println("Program end.");
        }

        return stringNumber;
    }

    public static void resultWrite(String str) throws IOException {
        FileWriter fw = new FileWriter("result.txt", true);
        fw.write(str + "\n");
        fw.flush();
        fw.close();
    }

    public static void main(String[] args) throws Exception {
        resultWrite(GetByteNumber());
    }

}




