import java.util.*;
class SumOdd{
    public static void Summation(int x){
        int sum = 0;
        for(int i = 1; i <= x; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Summation(x);
    }
}
