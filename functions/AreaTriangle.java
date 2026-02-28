import java.util.*;
class AreaTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double area = areaT(a, b, c);
        System.out.println(area);
    }
    static double areaT(double x, double y, double z){
        double s = (x + y + z) / 2;
    double n = s * (s - x) * (s - y) * (s - z);
        double ar = Math.sqrt(n);
        return ar;
    }
}