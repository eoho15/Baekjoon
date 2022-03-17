import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        if(x==0 || y==0){
            System.out.println("사분면이 아니고, x축 혹은 y축 입니다.");
        }
        else if(x>0 && y>0){
            System.out.println("1");
        }
        else if(x>0 && y<0){
            System.out.println("4");
        }
        else if(x<0 && y>0){
            System.out.println("2");
        }
        else
            System.out.println("3");
    }
}
