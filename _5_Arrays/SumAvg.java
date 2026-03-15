import java.util.*;
class SumAvg{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int i ;
        for(i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        int avg = sum / arr.length;
        System.out.println(avg);
    }
}