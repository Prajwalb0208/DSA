public class binarytodecimal {
    public static void main(String[] args) {
        int[] num = {1,1,0,1,0,1,0,1};
        bintodec(num);
    }
    public static void bintodec(int[] num){
        double res=0;
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
            res+=(num[i]*Math.pow(2, i));
        }
        System.out.println(res);
    }
}
