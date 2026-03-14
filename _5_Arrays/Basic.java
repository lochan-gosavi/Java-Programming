import java.util.*;
class Basic{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int avg, i, sum = 0;
        int[] arr = new int[5];
        for(i = 0; i <= 4; i++){
            arr[i] = sc.nextInt();
        }
        for(i = 0; i <= 4; i++){
            System.out.print(arr[i] + " ");
            sum = sum + arr[i];
        }
        
        avg = sum / 5;
        System.out.println();
        System.out.println("Average Marks are : " + avg);
        
    }
}