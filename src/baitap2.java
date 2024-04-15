import java.util.Arrays;
import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập độ dài của mảng mà bạn nghĩ vào đây: ");
        int numbers = scanner.nextInt();
        int[] array1;
        array1 = new int[numbers];
        for (int x = 0; x < numbers; x++){
            System.out.print("Hãy nhập phẩn tử thứ " + (x+1) + ": ");
            array1[x] = scanner.nextInt();
        }
        System.out.println("Vậy mảng của bạn có các phần tử như sau:");
            System.out.print(Arrays.toString(array1));
        System.out.println(" ");
        System.out.println("Hãy nhập số mà bạn muốn thêm vào đây: ");
        int num = scanner.nextInt();
        System.out.println("Hãy nhập vị trí mà bạn muốn thêm vào mảng vào đây: ");
        int locate =scanner.nextInt();
        int[] array2;
        array2 = new int[array1.length + 1];
        int x,y;
        for (y = x = 0; x < array2.length; x++){
            if (x != locate-1){
                array2[x] = array1[y];
                y++;
            }else {
                array2[x] = num;
            }
        }
        System.out.println("Ta có mảng sau khi thêm số " + num + " vào vị trí thứ " + locate + " là ");
        System.out.println(Arrays.toString(array2));
    }
}
