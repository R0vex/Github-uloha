import java.util.Random;
import java.util.Scanner;

public class Git {
    public void Uloha17()
    {
        Scanner in=new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Hi what is your name?");
        String name= in.nextLine();
        System.out.println("Hi "+name+" a test is waiting for you, are you ready? ");
        System.out.println();
        long start =System.currentTimeMillis();
        int y=0;
        int z=0;
        for (int i=1;i<5;i++){
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
        long finish =System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println();
        System.out.println("Your time: "+timeElapsed/1000+"secs");
        System.out.println();
        System.out.println("correct answers: "+ y);
        System.out.println("incorrect answers: "+z);
        if (y>z){
            System.out.println("Good job" +name+ "you are good!!!");
        }
        if (y==z){
            System.out.println();
            System.out.println("You can do better, "+name+"!");
        }
        if (z>y){
            System.out.println();
            System.out.println(name+ " you are a dumb donkey!!!");
        }
    }
}
