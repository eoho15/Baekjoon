import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = new int[26];

        String str =  scan.next();

        for(int i=0;i<str.length();i++) {

            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                arr[str.charAt(i)-'A']++;
            }else{
                arr[str.charAt(i)-'a']++;
            }
        }

        int max = 0;
        char result = '?';


        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = (char) (i + 65);
            } else if (arr[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}