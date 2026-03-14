//Take input the sides of the triangle and display whether it is isoscales, equilateral, scalene or right angled triangle
import java.util.*;
class TriangleSides1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle here : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(((a * a) + (b * b) == (c * c)) || ((a * a) + (c * c) == (b * b)) || ((b * b) * (c * c) == (a * a))){
            System.out.println("Right angled Triangle");
        }
        else if((a == b) && (b == c)){
            System.out.println("Equilateral Triangle");
        }
        else if((a == b) || (a == c) || (b == c)){
            System.out.println("Isoscalene Triangle");
        }
        else if((a != b) &&(b != c)){
            System.out.println("Scalene Triangle");
        }
        else{
            System.out.println("Not a valid triangle");
        }
        sc.close();
    }
}