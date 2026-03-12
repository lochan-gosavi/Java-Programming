import java.util.*;
class LCM{
    public static void Number(int a, int b){
        int min = (a > b) ? b : a;
        for(int i = min; i <= (a * b); i++){
            if(i % a == 0 && i % b == 0){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Number(a, b);
    }
}