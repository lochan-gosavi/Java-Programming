import java.util.*;
class SumOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit;
        int sum = 0;
        while (n > 0){
            digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        System.out.println(sum);
        sc.close();
    }
}