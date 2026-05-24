import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập địa chỉ email: ");
        String email = sc.nextLine();
        email = email.trim();
        String regex = "^[a-zA-Z0-9\\._]+@[a-zA-Z0-9\\.]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            System.out.println("Email hợp lệ");
        }
        else {
            System.out.println("Email không hợp lệ");
        }
    }
}
