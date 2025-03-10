public class ChkSorted {
    public static void main(String[] args) {
        int [] arr = {1,5,6,17,8,14};
        System.err.println(sorted(arr));;
    }
    public static boolean sorted(int arr[]){
        for(int i=1;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                return false;
            }
        }
        return true;
    }
}
