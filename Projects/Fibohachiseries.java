import java.util.Scanner;

// Program to print fibonacchi series up to the nth term
public class Fibohachiseries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n,a=0,b=1,s;
        System.out.println("Enter number of terms");
        n = scanner.nextInt();
        while(n>=0){
            s=a+b;
            System.out.println(a);
            a=b;
            b=s;
            n=n-1;
        }
        scanner.close();
    }
}
