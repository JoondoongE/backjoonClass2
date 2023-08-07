package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob11050 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int res = factorial(n)/(factorial(k)*factorial(n-k));
        System.out.println(res);
        
    }

    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        else{
            return factorial(n-1)*n;
        }
    }
}

