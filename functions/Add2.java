import java.util.*;
public class Add2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = Sum2(a, b);
        System.out.println("Sum = " + sum);
    }
    static int Sum2(int x, int y){
        int z = x + y;
        return z;
    }
}