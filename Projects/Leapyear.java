import java.util.Scanner;

//Program to check whether a Year is leap year or not
public class Leapyear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is the year");
        int year = scanner.nextInt();

        if (year>=1582){
            if ((year%4==0)&&(year%400==0)||(year%100!=0)){
                System.out.println(year + " is a Leap year");
            }else{
                System.out.println(year + " is not a Leap year");
            }
        }else{
            System.out.println("enter a year after 1582 as it is the first year in the georgian calendar");
        }
        
        scanner.close();
    }
}