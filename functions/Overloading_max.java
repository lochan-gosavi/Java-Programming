import java.util.*;
class Overloading_max{
    static int overmax(int x, int y){
        int d = (x < y) ? y : x;
        return d;
    }
    static float overmax(float x, float y){
        float e = (x < y) ? y : x;
        return e;
    }
    static double overmax(double x, double y){
        double f = (x < y) ? y : x;
        return f;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        System.out.println(overmax(a, b));
        System.out.println(overmax(c, d));
        System.out.println(overmax(e, f));
    }
    
}