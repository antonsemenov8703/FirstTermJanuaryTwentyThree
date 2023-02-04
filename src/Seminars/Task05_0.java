package Seminars;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Task05_0 {

    // Дана последовательность чисел. Необходимо вернуть сумму уникальных чисел
    public static void main(final String[] args) {
//    public static void main(final String[] args) {
//final - это константа в java

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,5,8,4,6,8));
        System.out.println(getSumOfUniqueValues(arr));

    }

    public static Integer getSumOfUniqueValues(final List<Integer> list){

        int sum = 0;
        for (Integer item: list){
            if (list.indexOf(item) == list.lastIndexOf(item)) {
                sum+=item;
            }
        }

        return sum;
    }

}



