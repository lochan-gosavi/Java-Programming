import java.util.*;
class AbsoluteValue{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > 0){
            System.out.println(a);
        }
        else if(a < 0){
            System.out.println(-1 * a);
        }
        else{
            System.out.println("Its Zero!");
        }
        sc.close();
    }
}