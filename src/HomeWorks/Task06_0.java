package HomeWorks;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;


public class Task06_0 {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2) Создать коллекцию ноутбуков.
// 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
//      ноутбуки, отвечающие фильтру.
//      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
// 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {

        Notebook nB1 = new Notebook("Apple", 1000, 16, 512, 1001);
        Notebook nB2 = new Notebook("HP", 500, 8, 1024, 1002);
        Notebook nB3 = new Notebook("Dell", 600, 8, 1024, 1003);

        List<Notebook> listNB = new ArrayList<>(Arrays.asList(nB1, nB2, nB3));
        System.out.println(listNB);

        Map<Integer, Notebook> mapNBId = new TreeMap<>();
        for (Notebook item : listNB) {
            mapNBId.put(item.idNumber, item);
        }
        System.out.println(mapNBId);

        Map<Integer, Notebook> mapNBCoast = new TreeMap<>();
        for (Notebook item : listNB) {
            mapNBCoast.put(item.coast, item);
        }
        System.out.println(mapNBCoast);
    }
}
