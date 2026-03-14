import java.util.*;
class Prime{
    public static void PrimeN(int x){
        for (int i = 2; i < x; i++){
            if(x % i == 0){
                System.out.println("Not a Prime Number!");
                break;
            }
            else{
                System.out.println("It's a Prime Number!");
                break;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        PrimeN(a);
    }
}