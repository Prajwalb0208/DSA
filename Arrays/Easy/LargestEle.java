package Arrays.Easy;
import java.util.*;

public class LargestEle {
    public static void main(String[] args) {
        int arr[] = {5,6,1,9,3,4};
        largest(arr);
    }  
    public static int largest(int arr[]){
        int res=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                res=arr[i];
            }
        }
        System.out.println(res);
        return res;
    }
}