package HomeWorks;

public class Task01_3 {

    //    Task3
//    Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
//    Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.

    public static void main(String[] args) {
        int [] arr = new int [0];
        int count = 0;
        int num = 0;

        for (int i = 2; i < 101 ; i++){
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    count++;
                    break;
                }
                else {
                    if (count == 0) {
                        System.out.print(i + " ");
                        break;
                    }
                }
                count = 0;
            }
        }
    }}


