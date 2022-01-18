package string;

import java.util.Scanner;

public class Bai3 {
    //Viết chương trình nhập vào một xâu ký tự s bất kỳ, sau đó chuyển sang dạng xen kẽ chữ in hoa và chữ
    //in thường. Ví dụ s = ABCDefgh thì kết quả là AbCdEfGh
    Scanner sc = new Scanner(System.in);
    public String st;

    public void nhapXau() {
        System.out.println("Nhap xau: ");
        st = sc.nextLine();
    }

    public void hienThi() {
        System.out.println(st);
    }

    public void chuannHoaChuoi() {
        st=st.trim().toLowerCase();
        st = st.replaceAll("\\s+", " ");
        String[] temp= st.split(" ");
        st="";
        for(int i=0;i<temp.length;i++) {
            st+=String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i<temp.length-1)
                st+=" ";
        }
    }

    public static void main(String[] args) {
        Bai3 a = new Bai3();
        a.nhapXau();
        System.out.println("Xau sau khi chuan hoa: ");
        a.chuannHoaChuoi();
        a.hienThi();
    }






}
