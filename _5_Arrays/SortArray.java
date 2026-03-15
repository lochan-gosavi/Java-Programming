import java.util.*;
class SortArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int i;
        for(i = 0; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}