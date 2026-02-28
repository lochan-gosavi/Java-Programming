import java.util.*;
class Product{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = prod(a, b);
        System.out.println(p);    
    }
    static int prod(int x, int y){
        return x * y;
    }
}