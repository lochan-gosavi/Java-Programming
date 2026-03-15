import java.util.*;
class ReverseArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int i;
        for(i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}