import java.util.*;
class GCD{
    public static void gcd1(int a, int b){
        int g = 1;
        int min = (a < b) ? a : b; 
        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i == 0){
                g = i;
            }
        }
        System.out.println(g);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd1(a, b);
    }
}