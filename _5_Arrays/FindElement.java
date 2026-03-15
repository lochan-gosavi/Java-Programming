import java.util.*;
class FindElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int i;
        for (i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        int p = -1;
        for(i = 0; i < arr.length; i++){
            if(arr[i] == search){
                p = i;
                System.out.println("Element found at " + (i+1));
                break;
            }
        }
        if(p == -1){
            System.out.println("Element not found");
        }
    }
}