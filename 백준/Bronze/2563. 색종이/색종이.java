import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNumber = Integer.parseInt(br.readLine());
        int[][] paper = new int[100][100];
        int sum = 0;

        for(int i=0;i<caseNumber;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j=x-1;j<x+9;j++){
                for(int k=y-1;k<y+9;k++){
                    if(paper[j][k] == 0){
                        paper[j][k] = 1;
                        sum++;
                    }
                }
            }

        }

        System.out.println(sum);



    }
}
