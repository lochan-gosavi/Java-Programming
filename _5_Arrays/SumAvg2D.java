import java.util.*;
class SumAvg2D{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int i, j;
        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
       
        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr.length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Average : ");
        int avg = sum / (3*3);
        System.out.println(avg);
    }
}