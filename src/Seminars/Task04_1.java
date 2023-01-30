package Seminars;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class Task04_1 {

    // Дан Deque, состоящий из последовательности цифр
    // проверить является ли последовательность полиндромом
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,0));
        System.out.println(checkOn(deque));

    }
    public static boolean checkOn (Deque<Integer> deque){
        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }
        return true;
    }
}
