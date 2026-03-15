import java.util.*;
class MinElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int i;
        for(i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for(i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimum of all element is : " + min);
    }
}