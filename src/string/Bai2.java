package string;

import java.util.Scanner;

public class Bai2 {
    //Viết chương trình nhập vào một xâu ký tự s bất kỳ, sau đó chuyển sang dạng xen kẽ chữ in hoa và chữ
    //in thường. Ví dụ s = ABCDefgh thì kết quả là AbCdEfGh
    Scanner sc = new Scanner(System.in);
    public String st;

    static String change(String st){
        System.out.println("xâu chuyển đổi là : ");
        StringBuilder str = new StringBuilder();
        for(int i=0;i<st.length();i++) {
            if (i%2!=0){
                str.append((st.charAt(i) + "").toLowerCase());
            }
            else {
                str.append((st.charAt(i) + "").toUpperCase());
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập xâu cần chuyển đổi");
        System.out.println(change(sc.next()));

    }
}
