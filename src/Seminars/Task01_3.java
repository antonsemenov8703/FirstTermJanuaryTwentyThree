package Seminars;

public class Task01_3 {

    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 1, 1};
        System.out.println(count_arr(array));

    }

    public static int count_arr(int[] array){
        int count = 0;
        int tempCount = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] == 1) tempCount++;
            else if (tempCount > count) {
                count = tempCount;
                tempCount = 0;
            }
        }
        return count > tempCount ? count : tempCount;
    }

}
