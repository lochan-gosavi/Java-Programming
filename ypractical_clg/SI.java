import java.util.*;
class SI{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        int si = (p * r * n) / 100;
        System.out.println(si);
        sc.close();
    }
}