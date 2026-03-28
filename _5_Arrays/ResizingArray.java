import java.util.*;
class ResizingArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        
        System.out.println("Enter the number of Students");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the marks of Students");
        for(i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the addictional number of Students");
        int r = sc.nextInt();
        int[] newarr = new int [r];
        for(i = 0; i < arr.length; i++){
            newarr[i] = arr[i];
        }
        
        for(i = 0; i < newarr.length; i++){
            newarr[i] = sc.nextInt();
        }
        System.out.println("Marks of all the students are : ");
        for(i = 0; i < newarr.length;i++){
            System.out.println(newarr[i]);
        }

    }
}