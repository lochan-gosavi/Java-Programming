import java.util.*;
class Modify{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int[] arr = new int[5];
        for(i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        modif(arr);
        for(i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void modif(int[] m){
        int i;
        for(i = 0; i < m.length; i++){
            m[i] = m[i] * 2;
        }
    }
    
}