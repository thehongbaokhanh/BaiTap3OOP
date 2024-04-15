import java.util.Arrays;
import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập độ dài của một mảng hai chiều:");
        int lenghtbig = scanner.nextInt();
        System.out.println("Hãy nhập độ dài của mảng trong mảng hai chiều:");
        int lenghtsmall = scanner.nextInt();
        int[][] arrray = new int[lenghtbig][lenghtsmall];
        int x,y;
        for (x = 0; x < lenghtbig; x++){
            for (y = 0; y < lenghtsmall; y++){
                double random = Math.random();
                random = random * 50;
                int randomInt = (int) random;
                arrray[x][y] = randomInt;
            }
        }
        System.out.println("Vậy ta có mảng hai chiểu có các pần tử ngãu nhiên bất kì như sau:");
        System.out.println(Arrays.deepToString(arrray));
        int max = arrray[0][0];
        for (x = 0; x < lenghtbig; x++){
            for (y = 0; y < lenghtsmall; y++){
                if (max < arrray[x][y]){
                    arrray[x][y] = max;
                }
            }
        }
        System.out.print("Vậy ta có số lớn nhất trong mảng hai chiều trên là: ");
        System.out.print(max);
    }
}
