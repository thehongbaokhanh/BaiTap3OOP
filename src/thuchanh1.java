import java.util.Scanner;
public class thuchanh1 {
    public static void main(String[] args) {
        Scanner infor = new Scanner(System.in);
        int size;
        String content = "";
        int array[];
        do{
            System.out.println("Hãy nhập độ dài của mảng mà bạn muốn đảo ngược:");
            size = infor.nextInt();
            if (size > 20){
                System.out.println("Độ dài tối đa có thể dùng mảng là 20.");
            }
        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < size){
        System.out.println("số hạng thứ "+ (i+1) + "  trong mảng là ");
        array[i] = infor.nextInt();
        i++;
        }
        System.out.println("Dãy số trong mảng mà bạn đã nhập là:");
        for (int j = 0; j < array.length; j++){
            content+= array[j] + " ";
        }
        System.out.println(content);
        content = "";
        System.out.println("Dãy số trong mảng sau khi đảo ngược lại là:");
        for(int j = array.length - 1; j >= 0; j--){
            content += array[j] + " ";
        }
        System.out.println(content);
        content = "";
    }
}
