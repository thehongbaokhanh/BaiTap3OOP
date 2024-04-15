import java.util.Arrays;
import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Hãy nhập độ dài của mảng mà bạn muốn vào đây: ");
        int lenght = scanner.nextInt();
        System.out.println("Nếu bạn muốn các phần tử trong mảng là số ngẫu nhiên thì vui lòng bấm số 0 nếu không hãy bấm số khác");
        int choice = scanner.nextInt();
        int[] array = new int[lenght];
        if(choice == 0){
            for (x = 0; x < lenght; x++){
                double random = Math.random();
                random = random * 100;
                int randomInt = (int) random;
                array[x] = randomInt;
            }
        }else {
            for (x = 0; x < lenght; x++){
                System.out.println("Hãy điền số hạng thứ " + ( x + 1 ) + ": ");
                array[x] = scanner.nextInt();
            }
        }
        System.out.println("Vậy ta có các phần tử trong mảng mà bạn nhập như sau:");
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (x = 1; x< lenght; x++){
            if (min > array[x]){
                min = array[x];
            }
        }
        System.out.println("Và số nhỏ nhất trong mảng sẽ là: ");
        System.out.println(min);
    }
}
