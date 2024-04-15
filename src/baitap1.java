import java.util.Arrays;
import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        System.out.println("-------------------------------------------------");
        System.out.println("Hãy nhập số các số hạng có trong bảng của bạn:");
        int numbers = scanner.nextInt();
        array = new int[numbers];
        for (int x = 0; x < numbers; x++){
            System.out.println("Hãy nhập số hạng thứ " + (x+1) + ":");
            array[x] = scanner.nextInt();
        }
        System.out.println("--------------------------------------");
        System.out.println("Hãy nhập phần tử mà bạn cần xóa:");
        int deletenum = scanner.nextInt();
//        int z = 0;
        System.out.println("Vậy ta có các phần tử trong mảng như sau: ");
        String content = " ";
        for (int x = 0; x < array.length; x++){
            content += array[x] + " ";
        }
        System.out.println(content);
        content = " ";
        int x,z;
        for (x = z = 0; z < array.length; z++){
            if (array[z] != deletenum){
                array[x] = array[z];
                x++;
            }
        }

        numbers = x;

        for ( x = 0; x < numbers;x++){
            content = content + array[x] + " ";
        }
        System.out.println("Ta có các phần t của mảng sau khi xóa phần từ bạn muốn xóa là: ");
        System.out.println(content);
        System.out.println(Arrays.toString(array));
    }
}
