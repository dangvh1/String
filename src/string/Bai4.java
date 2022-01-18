package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai4 {
    //Viết chương trình thực hiện nhập một xâu ký tự và tìm từ dài nhất trong xâu đó. Từ đó xuất hiện ở vị trí
    //nào?

    public static void main(String[] args) {
        nhap();
    }

    private static void nhap() {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println("xau vua nhap : " + s + "\n");
        timMax(s);
    }

    private static void timMax(String s) {
        int[] len;
        String[] ss;
        ss = s.split(" ");
        len = new int[ss.length];
        int max = 0;
        for (int i = 0; i < ss.length; i++) {
            int l = ss[i].length();
            len[i] = l;
            if (l > max) {
                max = l;
            }
        }
        int count = 0;
        for (int j = 0; j < ss.length; j++) {
            if (len[j] == max) {
                System.out.print(ss[j]);
                System.out.println("vi tri : " + count);
            }
            count += len[j]+1;
        }
    }
}



