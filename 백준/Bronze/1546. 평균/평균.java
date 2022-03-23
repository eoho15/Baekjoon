import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int score[] = new int[cnt];
        double scoreChanging[] = new double[cnt];
        double sum =0;
        int max = score[0];

        for(int i=0;i<score.length;i++){
            score[i] = scan.nextInt();
            // 입력한 cnt만큼 점수 입력하는 코드
            if(max < score[i]){
                max = score[i];
            }
            // 배열의 최대값 구하는 코드
        }

        for(int i=0;i<score.length;i++){
            scoreChanging[i] = (double)score[i] / (double)max * 100;

            sum = sum + scoreChanging[i];
        }


        double avg = sum/cnt;
        System.out.println(avg);

        // 여기서 값이 왜 0이 뜰까..ㅜㅜ
    }
}
