import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Number = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=2;i<=Math.sqrt(Number);i++){
            while(Number %i ==0) {
                sb.append(i).append('\n');
                Number = Number / i;
            }
        }

        if(Number != 1)
            sb.append(Number);

        System.out.print(sb);


    }
}
