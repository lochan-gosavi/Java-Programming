import java.util.*;
class Swap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = a;
        a = b;
        b = t;
        System.out.println("Now a = " + a + " and b = " + b);
        sc.close();
    }
}