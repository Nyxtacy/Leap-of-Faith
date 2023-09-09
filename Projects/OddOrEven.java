/*This is a program to check wheather a number is odd or even*/

import java.util.Scanner;

public  class  OddOrEven { 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your number? ");
        int lol = scanner.nextInt();

        if(lol%2==0){
            System.out.println("your number is Even");
        } else{
            System.out.println("your number is odd");
        }
        scanner.close();
    }
}