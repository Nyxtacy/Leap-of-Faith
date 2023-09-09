//test bing bong greatest number 
import java.util.Scanner;


public class GreatestNumber{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter number a");
        int a = scanner.nextInt();
        System.out.println("enter number b");
        int b = scanner.nextInt();
        System.out.println("enter number c");
        int c = scanner.nextInt();

        if(a>b){

            if(a>c){
                System.out.println("a is the greatest number");
        
            } else {
                System.out.println("c is the greatest number");
            }
            } else { 

                if(b>c) {
                System.out.println("b is the greatest number");
                } else {
                    System.out.println("c is the greatest number");
                }
            }
            scanner.close();
        }
    }
        

    
