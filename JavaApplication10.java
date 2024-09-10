
package javaapplication10;
import java.util.Scanner;


public class JavaApplication10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a number");
        int a = sc.nextInt();
        
        if(a%2==0){
            System.out.print("even");
        }
        else{
            System.out.println("odd");
        }
       
    }
    
}
