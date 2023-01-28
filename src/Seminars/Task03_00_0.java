package Seminars;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task03_00_0 {

//    Напишите программу на Java для создания нового списка массивов,
//    добавьте некоторые элементы (строки) и распечатайте коллекцию.


    public static void main(String[] args) {
        ArrayList<String> collors = new ArrayList<>();

        collors.add("Red");
        collors.add("Green");
        collors.add("Orange");
        collors.add("White");
        collors.add("Black");

//        if (collors.contains("Grey")) {
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }

//        collors.add(0,"Pink");
//        collors.add(5,"Yellow"); // добавляет элемент со смещением
//        collors.set(0, "Pink"); // заменяет
//        collors.remove(2);

        System.out.println(collors);

//        Collections.sort(collors); // сортируем по первой букве. Сортирует, потому что
//        System.out.println(collors);

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("World");
        arr.add("Earth");
        arr.add("Mars");
//        arr.add("Jupyter");

        ArrayList<String> newArr = (ArrayList<String>) collors.clone();//клонируем
        System.out.println(newArr);




//        Collections.copy(collors, arr); // Копирование одного списка в другой
//                                        // 1 какой меняем, 2 на какой меняет
//        System.out.println(collors);
//        System.out.println(arr);
//
//        Collections.reverse(arr);// сортировка в обратном порядке
//        System.out.println(arr);

//        System.out.println(collors.get(1));
//        System.out.println(collors.get(3));
//        for(String item : collors) {
//            System.out.println(item);
//        }

    }
}
