package Seminars;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Task05_0 {

    // Дана последовательность чисел. Необходимо вернуть сумму уникальных чисел
    public static void main(final String[] args) {
//    public static void main(final String[] args) {
//final - это константа в java

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,5,8,9,8,7,5));
        System.out.println(getSumOfUniqueValues(arr));
//        for (Integer item: arr){
//            System.out.println("first" + arr.indexOf(item));
//            System.out.println("last" + arr.lastIndexOf(item));
//
        }

    public static Integer getSumOfUniqueValues(List <Integer> list){

        int sum = 0;
        for (Integer item: list){
            if (list.indexOf(item) == list.lastIndexOf(item)) {// это методы проверки кол-ва вхождений
                sum+=item;
            }
        }
        return 0;
    }
}



