
package javaapplication4;


public class JavaApplication4 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        double x1 = 2;
        double x2 =3;
        double y1 = 4;
        double y2 = 5;
        double distance = Math.sqrt(Math.pow(x1-x2 , 2)+ Math.pow(y1-y2,2));
        System.out.println("the distance between point  " + x1 + " , " + y1 +" and " +  x2 + " , " + y2 + " is " + distance);
        
    }
    
}