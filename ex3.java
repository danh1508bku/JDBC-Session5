import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mật khẩu: ");
        String passwd = sc.nextLine();

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$!%]).{8,}$";
        if (passwd.matches(regex)) {
            System.out.println("Mật khẩu hợp lệ");
        }
        else {
            System.out.println("Mật khẩu không hợp lệ");
        }
    }
}
