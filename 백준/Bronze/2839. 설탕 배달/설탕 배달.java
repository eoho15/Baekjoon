import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int bong = 0;

        while(true){
            if(num % 5 ==0){
                bong += num / 5;
                System.out.println(bong);
                break;
            }
            else{
                num = num-3;
                bong++;
            }

            if(num < 0){
                System.out.println(-1);
                break;
            }
        }


    }
}
