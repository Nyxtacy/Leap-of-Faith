/*THis is a program to print a number in reverse order*/
import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your 3 digit number");
        int number = scanner.nextInt();

        int reverse = number%10;
        int reverse2 = number/10;
        int reverse3 = reverse2%10;
        int reverse4 = reverse2/10;
        int reverse5 = reverse4%10;
        String reversed =  Integer.toString(reverse)+Integer.toString(reverse3)+Integer.toString(reverse5);
        System.out.println(number+ " in reverse is " +reversed);
        scanner.close();
    }
    
}
