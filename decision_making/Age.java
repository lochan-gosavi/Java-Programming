import java.util.*;
class Age{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int s = sc.nextInt();
        int a = sc.nextInt();
        if(r < s && r < a){
            System.out.println("Ram is youngest");
        }
        else if(s < r && s < a){
            System.out.println("Shyam is youngest");
        }
        else{
            System.out.println("Ajay is youngest");
        }
        sc.close();
    }
}