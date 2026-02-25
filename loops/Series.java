import java.util.*;
class Series{
    
    static double fact(int n){
            int fact = 1;
            for(int i = 1; i <= n; i++){
                fact = fact * i;
            }
            return fact;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for(int i = 1; i <= 7; i++){
            sum += i / fact(i);
        }
        System.out.println(sum);
        sc.close();
    }
}