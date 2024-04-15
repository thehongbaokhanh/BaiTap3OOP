import java.util.Scanner;
public class thuchanh2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String member = " ";
        while (member != "") {
            System.out.println("------------------------------------------------------");
            System.out.println("Hãy nhập tên của sinh viên mà bạn muốn tìm vào đây:");
            member = scanner.next();
            int check = 0;
            String classcheck[] = {"Khánh-bố", "Nhân", "Sâm", "Dũng", "Khánh-con", "Hoàng", "Minh", "Tâm","Chí-Anh"};
            for (int x = 0; x < classcheck.length; ) {
                if (classcheck[x].equals(member)) {
                    System.out.println("Trong danh sách có sinh viên tên: " + classcheck[x] + " và là sinh viên thứ " + (x + 1) + " trong danh sách ");
                    break;
                } else {
                    check = check + 1;
                    x++;
                }
                if (check == classcheck.length) {
                    System.out.println("Không tìm thấy tên sinh viên này trong lớp.");
                    check = 0;
                    break;
                }
            }
        }
    }
}
