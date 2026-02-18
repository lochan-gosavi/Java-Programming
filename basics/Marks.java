import java.util.Scanner;
class marks{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks here : ");
        int marks1 = scanner.nextInt();
        int marks2 = scanner.nextInt();
        int marks3 = scanner.nextInt();
        int marks4 = scanner.nextInt();
        int marks5 = scanner.nextInt();
        System.out.println("Aggregate marks are : ");
        int aggregate = marks1 + marks2 + marks3 + marks4 + marks5;
        System.out.println("Percentage is : ");
        float per = (aggregate / 500) * 100;

        System.out.println(aggregate);
        System.out.println(per);
        scanner.close();
    }
}