package string;

public class Bai1 {
    //Sử dụng xâu ký tự để viết hàm kiểm tra số thuận nghịch. Áp dụng liệt kê các số thuận nghịch có 6 chữ
    //số.


    public static boolean ThuanNghich(int n) {
        String numberStr = String.valueOf(n);
        int size = numberStr.length();
        for (int i = 0; i < (size/2); i++) {
            if (numberStr.charAt(i) != numberStr.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 100000; i < 1000000; i++) {
            if (ThuanNghich(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Tổng các số thuận nghịch có 6 chữ số: " + count);
    }
}
