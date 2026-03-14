import java.util.*;
class R_factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fact(a));

    }
    static int fact(int x){
        int f = 1;
        if(x == 1){
            return (1);
        }
        else{
            f = x * fact(x - 1);
        }
        return f;
    }
}