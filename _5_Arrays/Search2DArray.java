import java.util.*;
class Search2DArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int[][] arr = new int[3][3];
    int i, j;
    for(i = 0; i < arr.length; i++){
        for(j = 0; j < arr.length; j++){
            arr[i][j] = sc.nextInt();
        }
    }

    System.out.print("Elements you entered are : ");
    for(i = 0; i < arr.length; i++){
        for(j = 0; j < arr.length; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("Enter the element to be searched : ");
    int k = sc.nextInt();
    for(i = 0; i < arr.length; i++){
        for(j = 0; j < arr.length; j++){
            if(k == arr[i][j]){
                System.out.println("Element found at " + i + ", " + j);
                return;
            }
        }
    }
    System.out.println("Element not found!");
    
    }
}