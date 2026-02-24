import java.util.*;
class ProfitLoss{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost Price here : ");
        int cp = sc.nextInt();
        System.out.println("Enter the Selling Price here : ");
        int sp = sc.nextInt();
        if(cp > sp){
            int d = cp - sp;
            System.out.println("You have incurred Loss of " + d);
        }
        else if(sp > cp){
            int d = sp - cp;
            System.out.println("You have done Profit of " + d);
        }
        else{
            System.out.println("No Profit No Loss!!");
        }
        sc.close();
    }
} 