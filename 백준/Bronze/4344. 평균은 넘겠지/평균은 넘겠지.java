import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int caseNum  = scan.nextInt();

        for(int i=0;i<caseNum;i++){
            int stuNum = scan.nextInt();
            int score[] = new int[stuNum];
            int cnt =0;
            double avg =0;
            double overavg = 0;

            for(int j=0;j<stuNum;j++){
                score[j] = scan.nextInt();
                avg += score[j];
            }

            avg = avg/stuNum;

            for(int k=0;k<stuNum;k++){
                if(score[k]>avg){
                    cnt++;
                }
            }

            overavg = ((double) cnt/ (double) stuNum)*100;
            System.out.print(String.format("%.3f",overavg));
            System.out.println("%");
        }
    }
}
