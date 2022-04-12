import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String words1 = scan.nextLine();
        int[] alpha = new int[26];
        for(int i=0;i<words1.length();i++){
            alpha[words1.charAt(i)-97]++;
        }

        for(int i=0;i<26;i++)
            System.out.print(alpha[i]+" ");

    }
}
