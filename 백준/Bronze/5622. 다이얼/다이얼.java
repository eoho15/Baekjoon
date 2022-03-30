import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int sum = 0;

        for(int i=0;i<str.length();i++) {
            int s = str.charAt(i);
            if(s>='A' && s<='C')
                sum = sum+3;
            else if(s>='D'&& s<='F')
                sum = sum+4;
            else if(s>='G'&& s<='I')
                sum = sum+5;
            else if(s>='J'&& s<='L')
                sum = sum+6;
            else if(s>='M'&& s<='O')
                sum = sum+7;
            else if(s>='P'&& s<='S')
                sum = sum+8;
            else if(s>='T'&& s<='V')
                sum = sum+9;
            else if(s>='W'&& s<='Z')
                sum = sum+10;
        }


        System.out.println(sum);



    }
}
