//Take input of lenght and bredth of Rectangle, display whether its area is greater then perimeter or not
import java.util.*;
class Rect{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght and breadth of Rectangle : ");
        int len = sc.nextInt();
        int bred = sc.nextInt();
        int area = len * bred;
        int peri = 2 * (len + bred);
        if(area > peri){
            System.out.println("Area is greater than perimeter");
        }
        else{
            System.out.println("Area is not greater than perimeter");
        }
    }
}