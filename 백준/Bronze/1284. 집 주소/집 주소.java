import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String N = br.readLine();
            int lenght = 1;
            if(N.equals("0")){
                break;
            }
            for(int i=0;i<N.length();i++){
                if(N.charAt(i) == '1'){
                    lenght += 3;
                }else if(N.charAt(i) == '0'){
                    lenght += 5;
                }else{
                    lenght += 4;
                }
            }
            System.out.println(lenght);
        }



    }
}
