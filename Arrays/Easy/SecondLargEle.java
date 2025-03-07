public class SecondLargEle{
    public static void main(String[] args) {
        int arr[] = {5,6,1,9,3,4,8,7,2};
        Secondlargest(arr);
    }
    public static int Secondlargest(int arr[]){
        int lar = Integer.MIN_VALUE;
        int seclar = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                seclar=lar;
                lar=arr[i];
            }
            else if(arr[i]>seclar && arr[i]!=lar){
                seclar=arr[i];
            }
        }
        System.out.println(lar);
        System.out.println(seclar);
        return seclar;
    }
}