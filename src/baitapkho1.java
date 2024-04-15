import java.util.Arrays;
import java.util.Scanner;

public class baitapkho1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Hãy nhập độ dài của mảng hai chiều mà bạn muốn vào đây:");
        int lenght1 = scanner.nextInt();
        System.out.println("Hãy nập độ dài của mảng nhỏ nằm trong mảng hai chiều vào đây");
        int lenght2 = scanner.nextInt();
        int[][] array = new int[lenght1][lenght2];
        int x,y;
        for (x = 0; x < lenght1; x++){
            for (y = 0; y < lenght2; y++){
                double random = Math.random();
                random = random * 50;
                int randomInt = (int) random;
                array[x][y] = randomInt;
            }
        }
        System.out.println("Như vậy ta có một mảng có các phần tử đc ấy ngẫu nhiên như sau: ");
        for (x = 0; x<lenght1; x++){
            System.out.println(Arrays.toString(array[x]));
        }
        System.out.println("Hãy nhập vị trí mảng nhỏ mà bạn muốn tính tổng vào đây: ");
        int locate = scanner.nextInt();
        for (x = 0; x < lenght2; x++){
            sum = sum + array[(locate-1)][x];
        }
        System.out.println("Vậy tổng của hàm đứng ở vị trí thứ " + locate + " trong mảng hai chiều là: " + sum);
    }
}
