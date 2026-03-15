import java.util.*;
class MergeArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 4; 
        int b = 4;
        int[] arr = new int[a];
        int[] arr1 = new int[b];
        int[] copy = new int[a + b];
        int i; 
        System.out.println("First Array : ");
        for(i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Second Array : ");
        for(i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        
        for(i = 0; i < arr.length; i++){
            copy[i] = arr[i];
        }
        for(i = 0; i < arr1.length; i++){
            copy[arr.length + i] = arr1[i];
        }
        
        for(i = 0; i < copy.length; i++){
            System.out.print(copy[i] + " ");
        }    
    }
}