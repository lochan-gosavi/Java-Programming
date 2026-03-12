import java.util.*;
class MulTable{
    public static void Table(int x){
    int b = 0;
    for(int i = 1; i <= 10; i++){
        System.out.println(x + " x " + i + " = " + (x * i));
    }
    
    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Table(x);
        
    }
}