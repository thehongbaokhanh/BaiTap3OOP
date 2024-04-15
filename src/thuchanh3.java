import java.util.Scanner;

public class thuchanh3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers;
        int[] array;
        do {
            System.out.println("---------------------------------------------");
            System.out.println("Hãy nhập số các số hạng mà bạn muốn so sánh:");
            numbers = scanner.nextInt();
            if (numbers > 20 || numbers == 0){
                System.out.println("Ứng dụng chỉ có thể so sánh được 20 số. Hãy điền lại");
                }
        }while (numbers > 20 || numbers == 0);
        int max = 0;
        array = new int[numbers];
        for (int x = 0; x < numbers; x++){
            System.out.println("Hãy điền số hạng thứ " + (x+1) + ": ");
            array[x] = scanner.nextInt();
        }
        for(int y = 0;y < numbers; y++){
            if (max < array[y]){
                max = array[y];
            }
        }
        System.out.println("số hạng lớn nhất trong dãy số bạn nhập là: " + max);
    }
}
