import java.util.*;
class RemoveDuplicates{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int i, j;
        
        for(i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(i = 0; i < arr.length; i++){
            boolean dup = false;
            for(j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    dup = true;
                    break;
                }
                
            }
            if(dup == false){
                System.out.print(arr[i] + " ");
            }
        }

    }
}