import java.util.Scanner;
public class digitsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        int sum = 0;
        while(a!=0){
            sum+=a%10;
            a/=10;

        }
        System.out.println(sum);
    }
}