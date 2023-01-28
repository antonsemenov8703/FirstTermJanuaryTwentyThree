package Seminars;

public class Task03_0 {


    // Даны следующие строки, cравнить их с помощью == и метода equals()
    // String s1 = "hello";
    // String s2 = "hello";
    // String s3 = s1;
    // String s4 = "h" + "e" + "l" + "l" + "o";
    // String s5 = new String("hello");
    // String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

//        System.out.println(s1 = s2);
//        System.out.println(s1.equals(s2));
//
//        System.out.println(s1 = s3);
//        System.out.println(s1.equals(s2));
//
//        System.out.println(s1 = s4);
//        System.out.println(s1.equals(s2));
//
//        System.out.println(s1 = s5);
//        System.out.println(s1.equals(s2));
//
//        System.out.println(s1 = s6);
//        System.out.println(s1.equals(s2));
// по equals всегда true потому что сравнивает значения, а = сравнивает ссылку???

        String [] arr = new String[]{s1,s2,s3,s4,s5,s6};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+ 1; j < arr.length; j++) {
                System.out.print("s" + (i+1) + " = s" + (j+1) + " = ");
                System.out.print(arr[i] = arr[j] + "");
                System.out.println(arr[i].equals(arr[j]));
            }
        }
    }
}
