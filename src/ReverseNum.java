public class ReverseNum {
    public static void main(String[] args) {
        int n=143;
        int j=0;
        int a=n;
        while(a>0){
            int i=a%10;
             j=(j*10)+i;
            a=a/10;


        }
        System.out.println("The reverse of number is"+j);
    }
}
