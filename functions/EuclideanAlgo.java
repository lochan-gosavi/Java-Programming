import java.util.*;
class EuclideanAlgo{
    public static void EucliAlgo(int a,int b){
        while(b != 0){
        int r = a % b;
        a = b;
        b = r;
        }
    System.out.println(a);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        EucliAlgo(a, b);
    }
}