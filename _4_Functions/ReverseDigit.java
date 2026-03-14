import java.util.*;
class ReverseDigit{
    public static void Reverse(int a){
        int rev = 0;
        while(a > 0){
            int ld = a % 10;
            rev = rev * 10 + ld;
            a = a / 10;
        }
        System.out.println(rev);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Reverse(x);
    }
}