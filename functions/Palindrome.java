import java.util.*;
class Palindrome{
    public static void Pal(int x){
        int rev = 0;
        int copy = x;
        while(x > 0){
            int ld = x % 10;
            rev = rev * 10 + ld;
            x /= 10;
        }
        if(rev == copy){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        Pal(a);
    }
}