

package HomeWorks;

        import java.util.Random;
        import java.util.Scanner;
        import java.util.Arrays;

public class Task01_1 {

//    Task1
//    Заполните массив случайным числами и выведите максимальное,
//    минимальное и среднее значение.
//    Для генерации случайного числа используйте метод Math.random(),
//    который возвращает значение в промежутке [0, 300].

    public static void main(String[] args) {


        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter number of elements ");
        boolean flag = iScanner.hasNextInt();
        int num = 0;
        if (flag) {
            num = iScanner.nextInt();
        }
        iScanner.close();


        int a = 0;
        int b = 300;
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = a + (int) (Math.random() * b);
        }

        //  //      Через rand.nextInt
        //        Random rand = new Random();
        //        for (int i = 0; i < num; i++){
        //            arr[i] = rand.nextInt(b);
        //        }


        for (int item: arr) {
            System.out.printf("%d ", item);
        }
        //другой вариант вывода
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
//            }

        int max_value = arr[0];
        for (int j = 0; j < arr.length; j++){
            if (max_value < arr[j]) {
                max_value = arr[j];
            }
        }

        int min_value = arr[0];
        for (int k = 0; k < arr.length; k++){
            if (min_value > arr[k]) {
                min_value = arr[k];
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Max value = " + max_value);

        System.out.println();
        System.out.println("Min value = " + min_value);

        System.out.println();
        float x = max_value;
        float y = min_value;

        System.out.println("Average value = " + (x+y)/2);

    }
}
