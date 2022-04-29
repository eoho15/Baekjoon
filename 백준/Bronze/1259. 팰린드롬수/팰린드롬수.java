import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.nextLine();
            boolean flag = true;

            if (input.equals("0")) {
                break;
            }
            else {
                for (int i = 0; i < input.length()/2; i++) {
                    if(input.charAt(i) != input.charAt(input.length() - (i + 1))) {
                        flag = false;
                        break;
                    }
                }
            }

            if(flag)
                System.out.println("yes");
            else
                System.out.println("no");

        }
            scan.close();
    }
}
