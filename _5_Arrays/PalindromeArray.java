import java.util.*;
class PalindromeArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int i, j, rev = 0;
        int n = arr.length;
        for(i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(i = 0; i < n/2; i++){
            if(arr[i] == arr[n - 1 - i]){
            System.out.println("Palidrome");
            return;
            }
        }
        System.out.println("Not a Palindrome");
        
    }
}