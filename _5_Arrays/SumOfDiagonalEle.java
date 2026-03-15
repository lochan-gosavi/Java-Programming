import java.util.*;
class SumOfDiagonalEle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int i, j;
        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements you entered are : ");
        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr.length; j++){
                if(i == j){
                    sum += arr[i][j];
                }
            }
        }

    

        System.out.println("Sum of Diagonal elements is : " + sum);
    }
}