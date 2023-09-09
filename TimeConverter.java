/*This is a program to convert minutes into hours and minutes*/

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your mins");
        int mins = scanner.nextInt();
        int star = 60;

        if (mins%60==0) {
            int hours = (mins/star);
            System.out.println(mins +" mins is " +hours +" hours ");

        } else {
            int hours = (mins/star); 
            int minutes = (mins%star);
            System.out.println(mins +" mins is " +hours +" hours " +minutes +" minutes");
        }
        scanner.close();
    }    
    
}
