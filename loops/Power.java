//Take two input and print first number raised to the power of another 
import java.util.*;
class Power{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  //2
        int b = sc.nextInt();  //3
        int c = 1;
        for(int i = 1; i <= b; i++){
            c = c * a;
        }
        System.out.println(c);
        sc.close();
    } 
}