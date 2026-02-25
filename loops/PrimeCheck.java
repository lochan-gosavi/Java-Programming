//Check whether the number is Prime or not
import java.util.*;
class PrimeCheck{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                flag = false;
                break;
            }
        }
        if(flag == false){
            System.out.println("Not a Prime"); 
        }
        else{
            System.out.println("Prime"); 
        }
        sc.close();
    }
}