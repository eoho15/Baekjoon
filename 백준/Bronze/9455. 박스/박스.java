import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());

        for(int i=0;i<caseNum;i++){
            String[] input = br.readLine().split(" ");
            int row = Integer.parseInt(input[0]);
            int column = Integer.parseInt(input[1]);
            int answer = 0;
            int arr[][] = new int[row][column];

            for(int j=0;j<row;j++){
                String[] row1 = br.readLine().split(" ");
                for(int k=0;k<column;k++){
                    arr[j][k] = Integer.parseInt(row1[k]);
                }
            }


            for(int j=0;j<column;j++) {
                int box = 0;
                for (int k = row - 1; k >= 0; k--) {
                    if (arr[k][j] == 1) {
                        answer += (row - k) - (++box);
                    }

                }

            }

            System.out.println(answer);

        }

    }
}
