public class ReverseNum {
    public static void main(String[] args) {
        int num=345;
        int rev=0;
        int a=num;
        while(a>0){
            int i=a%10;
             rev=(rev*10)+i;
            a=a/10;


        }
        System.out.println("The reverse of number is"+rev);
    }
}
