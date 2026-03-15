import java.util.*;

class DeletingArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int i;
        for(i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be deleted : ");
        int k = sc.nextInt();
        int p = -1;
        for(i = 0; i < arr.length; i++){
            if(arr[i] == k){
                p = i;
            }
        }
        if(p == -1){
            System.out.println("Element not found!");
        }
        else{
            for(i = p; i < arr.length - 1; i++){
                arr[i] = arr[i + 1];               
            }
            for(i = 0; i < arr.length - 1; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}