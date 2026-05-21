import java.util.Scanner;
import java.util.Random;
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = Integer.parseInt(sc.nextLine());
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                          + "abcdefghijklmnopqrstuvwxyz"
                          + "0123456789";
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            sb.append(characters.charAt(rnd.nextInt(characters.length())));
        }
        System.out.printf("Chuỗi ngẫu nhiên có %d ký tự là: %s",n,sb);
    }
}
