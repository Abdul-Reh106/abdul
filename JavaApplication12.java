
package javaapplication12;

import java.util.Scanner;

public class JavaApplication12 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        int b = 0 ;
        for(int i=1;i<=10;i++){
            b=a*i;
            System.out.println("multiplication table is " + b);
        }
    }
    
}
