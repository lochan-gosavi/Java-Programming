import java.util.*;
class ArmstrongNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = n;
        int copy2 = n;
        int ld;
        int sum = 0, count = 0;
        while(n > 0){
            ld = n % 10;
            n = n / 10;
            count++;
        }
        while(copy > 0){
            ld = copy % 10;
            sum += Math.pow(ld, count);
            copy = copy / 10;
        }
        if(sum == copy2){
            System.out.println(copy2 + " is a Armstrong Number");
        }
        else{
            System.out.println(copy2 + " is not a Armstrong Number");
        }
        sc.close();
    }
}