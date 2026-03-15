import java.util.*;
class Check_sort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int i;
        for(i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
         
        for(i = 1;  i < arr.length; i++){
            if(arr[i] < arr[i - 1]){
                System.out.println("Not sorted");
                return;
            }
        }  

        System.out.println("Sorted");
  }
}