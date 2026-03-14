import java.util.*;
class AreaRec{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int len = sc.nextInt();
        int bred = sc.nextInt();
        int area = len * bred;
        System.out.println(area);
        sc.close();
    }
}