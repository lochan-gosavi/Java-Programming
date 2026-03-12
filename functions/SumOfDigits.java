import java.util.*;
class SumOfDigits{
    public static void Summation(int x){
        int ld;
        int sum = 0;
        while(x > 0){
            ld = x % 10;
            sum += ld;
            x = x / 10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Summation(a);
    }
}