import java.util.*;
class LCM{
    public static int Number(int a, int b){
        int e = 1;
        int min = (a > b) ? b : a;
        for(int i = min; i <= (a * b); i++){
            if(i % a == 0 && i % b == 0){
                e = i;
                break;
            }
        }
        return e;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Number(Number(a, b), c));
    }
}