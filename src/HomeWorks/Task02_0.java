//package HomeWorks;
//
//import java.io.File;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.nio.ByteBuffer;
//import java.nio.ByteOrder;
//import java.nio.charset.Charset;
//import java.nio.charset.StandardCharsets;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Map.Entry;
//
//
//
//
//public class Task02_0 {
//
////Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
////Требуется перехватить все возможные ошибки и вывести их в логгер.
////
////После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате
//    public static void main(String[] args) {
//
//
//        File f1 = new File("file.txt");
//
//
//        try{
//            add ("key1", "значение 1");
//            add ("key2", "значение 2");
//            add ("key4", "значение 3");
//            saveFile(file);
//
//            // код в котором может появиться ошибка (нет файла)
//        }
//        catch (Exception e) {
//            // обработка, если ошибка случилась
//        }
//        finally {
//            // код который выполнится в любом случае
//        }
//
//
//        try {
//            loadFile(file);
//            String key1 = "key1";
//            String key2 = "key2";
//            String key3 = "key3";
//            System.out.printf("%s: %s\n", key1, find(key1));
//            System.out.printf("%s: %s\n", key2, find(key2));
//            System.out.printf("%s: %s\n", key3, find(key3));
//        }
//        catch (IOException e) {
//            e.printStackTrace ();
//        }
//
//
//
//        try {
//            String pathProject = System.getProperty ("user.dir");
//            String pathFile = pathProject.concat ("/file.txt") ;
//            File f3 = new File (pathFile);
//            System.out.printin ("try");
//        } catch (Exception e) {
//            System.out.printin ("catch");
//        }
//        finally
//        { System.out.printin ("finally"); }
//
//
//
//    }
//
//    public String findJewelsInStones(String jewels, String stones){
//
//        return "";
//
//
//
//    Logger logger = Logger.getLogger ()
//        ConsoleHandler info = new ConsoleHandler () ;
//        log.addHandler (info);
//
//
//
//        Logger logger = Logger.getLogger(Ex005_Logger.class.getName()) ;
//        ConsoleHandler ch = new ConsoleHandler ();
//
//        logger.addHandler(ch);
//
//        //SimpleFormatter sFormat = new SimpleFormatter ();
//        XMLFormatter xml = new XMLFormatter () ;
//        //ch.setFormatter(sFormat);
//        ch.setFormatter(xml);
//
//
//    }
//
//}
