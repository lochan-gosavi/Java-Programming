import java.util.*;
class Power{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number raised to second one");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = raised(a, b);
        System.out.println(result);
    }
    static int raised(int x, int y){
        int c = 1;
        for(int i = 1; i <= y; i++){
            c = c * x;
        
        }
        return c;
    }
}