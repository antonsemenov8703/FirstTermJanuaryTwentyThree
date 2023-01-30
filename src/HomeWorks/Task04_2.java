package HomeWorks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task04_2 {

    // Даны два Deque представляющие два неотрицательных целых числа.
    // Цифры хранятся в обратном порядке, и каждый из их узлов содержит одну цифру.
    // Сложите два числа и верните сумму в виде связанного списка.

    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
// result [6,6,0,1]

        Deque<Integer> d3 = new ArrayDeque<>();
        int temp = d1.size();

        while (temp > 0) {
            int x = d1.pollLast();
            int y = d2.pollLast();
            if (x + y < 10) {
                d3.addFirst(x + y);
            } else {
                d3.addFirst((x + y) / 10);
                d3.addFirst((x + y) % 10);
            }
            temp--;
        }
        System.out.println(d3);
    }
}

