import java.util.Arrays;
import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nập độ dài của mảng 1 vào đây: ");
        int leghth1 = scanner.nextInt();
        System.out.print("Hãy nhập độ dài của mảng 2 vào đây: ");
        int leghth2 = scanner.nextInt();
        int[] array1 = new int[leghth1];
        int[] array2 = new int[leghth2];
        int[] array3 = new int[leghth1 + leghth2];
        System.out.println("Ta có các phần tử tự nhiên bất kì có trong mảng 1 như sau: ");
        for (int x = 0; x < array1.length; x++){
            double random = Math.random();
            random = random * 100;
            int randomInt = (int) random;
            array1[x] = randomInt;
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("Ta có các phần tử tự nhiên bất kì có trong mảng 2 như sau: ");
        for (int x = 0; x < array2.length; x++){
            double random = Math.random();
            random = random * 100;
            int randomInt = (int) random;
            array2[x] = randomInt;
        }
        System.out.println(Arrays.toString(array2));
        System.out.println("Vậy ta có mảng gộp như sau:");
        int x,y;
        for (x = y  = 0; x < array3.length; x++ ){
            if (x >= leghth1){
                array3[x] = array2[y];
                y++;
            }else {
                array3[x] = array1[x];
            }
        }
        System.out.println(Arrays.toString(array3));
    }
}
