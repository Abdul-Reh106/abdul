
package javaapplication15;
import java.util.Scanner;
public class JavaApplication15 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        while(a>=10){
            a = a/2;
            System.out.println("number is " + a);
                    
        }
    }
    
}
