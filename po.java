package opencv_codes;

import java.util.Scanner;

public class po {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 100:");
        
        for(int num =2 ; num<100 ;num++){
            boolean  isprime = true;
            for(int i =2 ; i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isprime = false;
                    break;
            }

           }
             if(isprime){
               System.out.println(num);
            } 
       }
    }
}
