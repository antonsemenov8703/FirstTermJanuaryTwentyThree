package HomeWorks;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Task03_0 {

    // Пусть дан произвольный список целых чисел
    // Нужно удалить из него четные числа
    // Найти минимальное значение
    // Найти максимальное значение
    // Найти среднее значение
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(64, 123, 43, 55, 57, 44, 23));
        System.out.println(list);
        removeEvenValue(list);
        System.out.println(list);
        System.out.println("Max = " + getMax(list) + " Min = " + getMin(list) + " Average = " + getAverage(list));
    }

    public static List<Integer> removeEvenValue(List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
//        System.out.println(list);
        return new ArrayList<>();
    }

    public static Integer getMax(List<Integer> list){
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++ ){
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }

    public static Integer getMin(List<Integer> list){
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++ ) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static Integer getAverage(List<Integer> list){
        int max = getMax(list);
        int min = getMin(list);
        int average = (max + min)/2;

        return average;
    }
}


