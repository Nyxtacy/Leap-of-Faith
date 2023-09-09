/*This is a program to check if your eligible to vote*/

import java.util.Scanner;

public class VoteCheck {
    public static void main(String[] args) {
        
        int minage = 18;
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your age?");
        int age = scanner.nextInt();

        int c = minage-age;

        if (age>18){
            System.out.println("you are eligible to vote");
            
        } else {
            System.out.println("you will be able to vote in " +c +" years");
        }
        scanner.close();
    }
}
