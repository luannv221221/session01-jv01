import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        String fullName;
        int age;
        // khởi tạo đối tượng sc
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào họ tên : ");
        fullName = sc.nextLine();
        System.out.println("Moời bạn nhập vào tuổi : ");
        age = sc.nextInt();

        System.out.println("Họ và tên : "+fullName);
        System.out.println("Năm sinh : "+(2024-age));
    }
}
