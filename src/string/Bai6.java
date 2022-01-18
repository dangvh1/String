package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai6 {
    //Nhập một câu không quá 20 từ, mỗi từ không quá 10 ký tự. Viết chương trình tách các từ trong câu và
    //in các từ theo thứ tự Alphabet.
    public static void sapxep(String s){
       String tg= new String();
        StringTokenizer s1= new StringTokenizer(s);
        int n= s1.countTokens();
        String arr[]= new String[n];
        int i=0;
        while(s1.hasMoreTokens()){
            arr[i]= s1.nextToken();
            i++;
        }
       for(int k=0;k<n-1;k++) {
           for (int j = k + 1; j < n; j++) {
               if (arr[k].compareTo(arr[j]) > 0) {
                   tg = arr[k];
                   arr[k] = arr[j];
                   arr[j] = tg;
               }
           }
       }
       for(int j=0;j<n;j++) {
         System.out.print(arr[j]+"  ");
       }
         System.out.println("");
    }
        public static void main(String[] args) {
            String s0= new String();
            Scanner sc= new Scanner(System.in);
            System.out.println("nhap xau s0: ");
            s0= sc.nextLine();
            sapxep(s0);
        }


}
