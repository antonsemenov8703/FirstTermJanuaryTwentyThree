package HomeWorks;

public class Task01_2 {

//    Task2
//    Реализуйте алгоритм сортировки пузырьком для сортировки массива

    public static void main(String[] args) {

        int[] arr = new int[]{134, 23, 0, 62, 452, 67, 68};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int item: arr) {
            System.out.printf("%d ", item);
        }
    }
}
