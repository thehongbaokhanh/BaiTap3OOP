import java.util.Scanner;

public class baitapkho3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập một chữ gì đó vào đây:");
        String infor = scanner.nextLine();
        System.out.println("Nhập chứ số mà bạn muốn đếm");
        char input = scanner.next().charAt(0);
        int count = 0;
        for (int x = 0; x < infor.length(); x++){
            if (infor.charAt(x) == input){
                count = count + 1;
            }
        }
        System.out.println("Vậy ta có trong dòng chữ " + infor + " thì có " + count + " chữ giống nhau");
    }
}
