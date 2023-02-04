package Seminars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task05_1 {

    // Дана последовательность чисел. Необходимо вернуть число совпавших пар в этой последовательности
    // пример 1:  In: arr = [1, 2]  Out: 0
    // пример 2:  In: arr = [1, 1, 2]  Out: 1
    // пример 3:  In: arr = [1, 1, 1, 2, 2]  Out: 4

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2));
        System.out.println(getNumberOfCouples(arr));
        }

    public static Integer getNumberOfCouples(List<Integer> list){
        Integer count = 0;
        for (int i = 0; i < list.size(); i++){
            for (int j = i+1; j < list.size(); j++){
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
