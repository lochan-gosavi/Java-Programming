//Check whether the triangle is valid or not by taking input angles
import java.util.*;
class Triangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angles here : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a + b + c) == 180){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Not a valid triangle");
        }
        sc.close();
    }
}