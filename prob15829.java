package class2;

import java.util.Scanner;

public class prob15829 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        char arrS[] = new char[n];
        long sum =0;
        long aa;
        int prime =1234567891;

        for(int i=0;i<arrS.length;i++){
            arrS[i] = s.charAt(i);
        }
        
        int pow=1;

        for(int i=0;i<n;i++){
            int tmp =s.charAt(i)-'a'+1;
            aa = pow*tmp;
            pow = (31*pow)%prime;
            sum +=aa;
        }
        sum = sum%prime;
        sc.close();
        System.out.println(sum);
    }
}
