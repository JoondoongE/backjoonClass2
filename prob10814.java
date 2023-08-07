package class2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Arrays;
import java.util.StringTokenizer;
public class prob10814 {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(br.readLine());
        String [][] array = new String[N][2];

        for(int i=0;i<N;i++){
            array[i][0] = st.nextToken();
            array[i][1] =st.nextToken();
        }

        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2){
                return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(array[i][0]).append(' ').append(array[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}
