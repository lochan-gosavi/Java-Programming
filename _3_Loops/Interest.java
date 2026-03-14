import java.util.*;
class Interest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 10; i++){
            double p = sc.nextDouble();
            double q = sc.nextDouble();
            double r = sc.nextDouble();
            double n = sc.nextDouble();
            double a = p * (Math.pow(1 + (r / q), (n*q)));
            System.out.println(a);
        }
        sc.close();
    }
}