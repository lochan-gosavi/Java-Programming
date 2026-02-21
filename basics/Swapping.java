import java.util.*;
class Swapping{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int D = sc.nextInt();
        int temp = C;
        C = D;
        D = temp;
        System.out.println("After Swapping : C = " + C + " " + "D = " + D);
        sc.close();
    }
}