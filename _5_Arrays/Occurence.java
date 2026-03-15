import java.util.*;
class Occurence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i;
        int count = 0;
        for(i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Give the number whose occurence is to be determined : ");
        int a = sc.nextInt();
        for(i = 0; i < arr.length; i++){
            if(a == arr[i]){
                count++;
            }
        }
        System.out.println("Number " + a + " has occured in array for " + count + " times.");
    }
}