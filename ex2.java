public class ex2 {
    public static void main(String[] args) {

        int n = 1000000;

        long startString = System.currentTimeMillis();
        String str = "Hello";
        for (int i = 0; i < n; i++) {
            str += " World";
        }
        long endString = System.currentTimeMillis();

        long startBuilder = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < n; i++) {
            sb.append(" World");
        }
        long endBuilder = System.currentTimeMillis();

        long startBuffer = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < n; i++) {
            sbf.append(" World");
        }
        long endBuffer = System.currentTimeMillis();

        // ================= OUTPUT =================
        System.out.println("Thời gian thực hiện với String: "
                + (endString - startString) + " ms");

        System.out.println("Thời gian thực hiện với StringBuilder: "
                + (endBuilder - startBuilder) + " ms");

        System.out.println("Thời gian thực hiện với StringBuffer: "
                + (endBuffer - startBuffer) + " ms");

        System.out.println("\nNhận xét:");
        System.out.println("- String: Không hiệu quả cho phép nối chuỗi nhiều lần do tạo ra nhiều đối tượng mới.");
        System.out.println("- StringBuilder: Hiệu quả và nhanh chóng, thích hợp cho nhiều thao tác nối chuỗi trong một luồng.");
        System.out.println("- StringBuffer: Tương tự như StringBuilder nhưng an toàn với đa luồng, có thể chậm hơn một chút do đồng bộ hóa.");
    }
}
