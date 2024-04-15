import java.util.Arrays;
import java.util.Scanner;

public class baitapkho2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y;
        System.out.println("Hãy nhập độ lớn của ma trận vuông: ");
        int lenght = scanner.nextInt();
        int[][] array = new int[lenght][lenght];
        for (x = 0; x < lenght; x++){
            for (y = 0; y < lenght; y++){
                double random = Math.random();
                random = random * 10;
                int randomInt = (int) random;
                array[x][y] = randomInt;
            }
        }
        System.out.println("Vậy ta có ma trận vuông có các phần tử là các số ngẫu nhiên như sau:");
        for (x = 0; x < lenght; x++){
            System.out.println(Arrays.toString(array[x]));
        }
        int sum = 0;
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("1. Nếu bạn muốn tính tổng các phần tử trên đường chéo chính hướng trái:");
            System.out.println("2. Nếu bạn muốn tính tổng các phần tử trên đường chéo chính hướng phải:");
            int choice = scanner.nextInt();
        switch (choice){
            case 1:
                for (x = 0; x < lenght; x++){
                    sum = sum + array[x][x];
                }
                System.out.println("Vậy ta có tổng của các phần tử nằm trên đg chéo hướng trái là: " + sum + ".");
                break;
            case 2:
                for (x = 0, y = (lenght -1); x < lenght; x++){
                    sum = sum + array[x][y];
                    y--;
                }
                System.out.println("Vậy ta có tổng của các phần tử nằm trên đg chéo hướng phải là: " + sum + ".");
                break;
            default:
                System.out.println("Không có lựa chọn thứ " + choice + " .");
        }
    }
}
