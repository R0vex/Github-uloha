import java.util.Random;
import java.util.Scanner;

public class Git {
    public void Uloha17()
    {
        Scanner in=new Scanner(System.in);
        Random rnd = new Random();
        int y=0;
        int z=0;
        for (int i=1;i<4;i++){
            int c=rnd.nextInt(3);
            int a=rnd.nextInt(91)+10;
            int b=rnd.nextInt(91)+10;
            if (c == 0) {
                System.out.println(a + "*" + b + "=");
                int result = a * b;
                result = in.nextInt();
                if (result == (a * b)) {
                    System.out.println("correct");
                    y++;
                } else {
                    System.out.println("incorrect");
                    z++;
                }
            }
            if (c == 1) {
                System.out.println(a + "-" + b + "=");
                int result = a - b;
                result = in.nextInt();
                if (result == (a - b)) {
                    System.out.println("correct");
                    y++;
                } else {
                    System.out.println("incorrect");
                    z++;
                }
            }
            if (c == 2) {
                System.out.println(a + "+" + b + "=");
                int result = a + b;
                result = in.nextInt();
                if (result == (a + b)) {
                    System.out.println("correct");
                    y++;
                } else {
                    System.out.println("incorrect");
                    z++;
                }
            }
        }
        System.out.println("correct answers: "+ y);
        System.out.println("incorrect answers: "+z);
    }
}
