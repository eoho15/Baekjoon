import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testNum = scan.nextInt();

        for (int i = 1; i <= testNum; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.printf("Case #%d: %d + %d = %d ", i, a, b, a + b);
            System.out.println();
        }
    }
}
