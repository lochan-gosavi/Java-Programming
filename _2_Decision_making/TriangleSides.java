//If three sides are input then check whether it is valid or not

import java.util.*;
class TriangleSides{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of Triangle here : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a > b && a > c){
            if((b + c) > a){
                System.out.println("Valid Triangle");
            }
            else{
            System.out.println("Invalid Triangle");
        }
        }
        else if(b > a && b > c){
            if((a + c) > b){
                System.out.println("Valid Triangle");
            }
            else{
            System.out.println("Invalid Triangle");
        }
        }
        else if(c > a && c > b){
            if((a + b) > c){
                System.out.println("Valid Triangle");
            }
            else{
            System.out.println("Invalid Triangle");
        }
        }
        else{
            System.out.println("Invalid Triangle");
        }
    sc.close();
    }
}