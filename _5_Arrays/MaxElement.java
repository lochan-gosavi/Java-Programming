import java.util.*;
class MaxElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int[] arr = new int[6];
        for(i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum element in the array is : " + max);
    }
}