package opencv_codes;
import java.util.Scanner;
public class yu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        Boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a%2==0){
                isPrime = false;
                break;
            }    
        }
        if(isPrime){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }

    }
}
