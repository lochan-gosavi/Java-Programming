import java.util.*;
class FibonacciSeries{
    public static void Fibo(int x){
        int a = 0, b = 1;
        int c;
        for(int i = 1; i <= x; i++){
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Fibo(a);
    } 
}