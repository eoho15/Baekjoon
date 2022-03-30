import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int[] arr = new int[str.length()];
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
            if (arr[i] == 32) {
                cnt++;
            }
        }
        if (arr[0] != 32 && arr[str.length() - 1] != 32)
            cnt += 1;
        if (arr[0] == 32 && arr[str.length() - 1] == 32)
            cnt -= 1;
        System.out.println(cnt);
    }
}

