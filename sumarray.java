
public class sumarray {
    public static void main(String[] args) {
       
        int arr[]={10,20,30,40};
        int sum = 0;
        int len = arr.length;
        for(int i = 0 ; i<len;i++){
           sum+=arr[i];
        }
        System.out.println(sum);

    }
}