public class ChkDup {
    public static void main(String[] args) {
        int arr[] = {1,5,3,9,0,10};
        System.out.println(Duplicate(arr));
    }
    public static boolean Duplicate(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
