import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int cnt = Integer.parseInt(br.readLine());
            if(cnt == 0) {
                break;
            }

            String[] arr = new String[cnt];
            for(int i=0;i<cnt;i++){
                arr[i] = br.readLine();
            }

            Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
                }
            });
            System.out.println(arr[0]);
        }


    }
}
