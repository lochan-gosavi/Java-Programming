import java.util.Scanner;
public class Rectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the Rectangle : ");
        int len = sc.nextInt();
        System.out.println("Enter the breadth of the Rectangle : ");
        int bred = sc.nextInt();
        System.out.println("Enter the Radius of circle : ");
        int rad = sc.nextInt();
        int area = len * bred;
        int peri = 2 * (len + bred);
        double areac = 3.142 * (rad * rad);
        double circum = 2 * 3.142 * rad;
        System.out.println("Area of the rectangle is : " + area); 
        System.out.println("Perimeter of the rectangle is : " + peri); 
        System.out.println("Area of the Circle is : " + areac); 
        System.out.println("Circumference of circle is : " + circum); 
        sc.close();
    }
}