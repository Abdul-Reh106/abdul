import java.util.Scanner;
public class minmaxarr {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i =0 ; i<arr.length ; i++){
            System.out.println("enter the elements");
            arr[i] = sc.nextInt();
        }
        for(int element : arr){
            System.out.println(element + "\t");
        }
        int max =  arr[0];
        int min = arr[0];
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
                System.out.println("max element"+ max);
            }
            else if(arr[i]<min){
                min = arr[i];
                System.out.println("min element"+ min);
            }
        }

       
        
        


    }

    
}